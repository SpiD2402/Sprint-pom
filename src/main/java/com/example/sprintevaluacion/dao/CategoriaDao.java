package com.example.sprintevaluacion.dao;


import com.example.sprintevaluacion.entity.CategoriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDao extends JpaRepository<CategoriaEntity,Long> {

}
