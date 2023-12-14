package com.example.sprintevaluacion.service;


import com.example.sprintevaluacion.entity.CategoriaEntity;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<CategoriaEntity> obtenerTodo();
    CategoriaEntity obtenerPorId(Long id) throws Exception;

    CategoriaEntity crear(CategoriaEntity categoria);

    Optional<CategoriaEntity> actualizar(CategoriaEntity categoriaActualizado) throws Exception;

    void eliminar(Long id) throws Exception;

}
