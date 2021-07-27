package com.co.runt.model.repository;

import com.co.runt.model.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Serializable> {
}
