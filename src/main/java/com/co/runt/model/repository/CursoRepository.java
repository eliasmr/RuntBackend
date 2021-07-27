package com.co.runt.model.repository;

import com.co.runt.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CursoRepository extends JpaRepository<Curso, Serializable> {
}
