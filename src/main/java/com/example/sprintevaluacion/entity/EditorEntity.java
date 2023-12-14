package com.example.sprintevaluacion.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "editor")
public class EditorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nombre;

    private int estado;
}
