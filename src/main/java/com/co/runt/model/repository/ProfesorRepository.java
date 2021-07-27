package com.co.runt.model.repository;

import com.co.runt.model.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("profesorRepository")
public interface ProfesorRepository extends JpaRepository<Profesor, Serializable> {
}
