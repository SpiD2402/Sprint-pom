package com.example.sprintevaluacion.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Data
@Entity
@Table(name = "libro")
public class LibroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private  int estado;

    @ManyToOne
    @JoinColumn(name = "editor_id")
    private EditorEntity editor;


    @ManyToMany
    @JoinTable(
            name="libro_categoria",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns =@JoinColumn(name ="categoria_id")
    )
    private Set<CategoriaEntity> categorias = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name="libro_autor",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns =@JoinColumn(name ="autor_id")
    )
    private Set<AutorEntity> autores = new HashSet<>();

}
