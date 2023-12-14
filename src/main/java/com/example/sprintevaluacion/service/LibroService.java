package com.example.sprintevaluacion.service;

import com.example.sprintevaluacion.entity.LibroEntity;

import java.util.List;
import java.util.Optional;

public interface LibroService {

    List<LibroEntity>obtenerTodo();
    LibroEntity obtenerPorId(Long id) throws Exception;

    LibroEntity crear(LibroEntity libro);

    Optional<LibroEntity> actualizar(LibroEntity autorActualizado) throws Exception;

    void eliminar(Long id) throws Exception;

}
