package com.example.sprintevaluacion.service;


import com.example.sprintevaluacion.entity.AutorEntity;

import java.util.List;
import java.util.Optional;

public interface AutorService {

    List<AutorEntity> obtenerTodo();
    AutorEntity obtenerPorId(Long id) throws Exception;

    AutorEntity crear(AutorEntity autor);

    Optional <AutorEntity> actualizar(AutorEntity editorActualizado) throws Exception;

    void eliminar(Long id);

}
