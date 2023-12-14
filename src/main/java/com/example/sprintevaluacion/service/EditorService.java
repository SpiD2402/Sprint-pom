package com.example.sprintevaluacion.service;



import com.example.sprintevaluacion.entity.EditorEntity;

import java.util.List;
import java.util.Optional;

public interface EditorService {
    List<EditorEntity> obtenerTodo();
    EditorEntity obtenerPorId(Long id) throws Exception;

    EditorEntity crear(EditorEntity editor);

    Optional<EditorEntity> actualizar(EditorEntity editor) throws Exception;

    void eliminar(Long id) throws Exception;
}
