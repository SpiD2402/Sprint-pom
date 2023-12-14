package com.example.sprintevaluacion.dao;


import com.example.sprintevaluacion.entity.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroDao extends JpaRepository<LibroEntity,Long> {
}
