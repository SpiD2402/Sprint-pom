package com.example.sprintevaluacion.dao;


import com.example.sprintevaluacion.entity.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorDao extends JpaRepository<AutorEntity,Long> {
}
