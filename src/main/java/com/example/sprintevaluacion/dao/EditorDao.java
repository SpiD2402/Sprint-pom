package com.example.sprintevaluacion.dao;


import com.example.sprintevaluacion.entity.EditorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorDao extends JpaRepository<EditorEntity,Long> {
}
