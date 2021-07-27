package com.co.runt.model.repository;

import com.co.runt.model.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface EstudianteRepository extends JpaRepository<Estudiante, Serializable> {
}
