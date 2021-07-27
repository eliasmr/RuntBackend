package com.co.runt.model.repository;

import com.co.runt.model.entity.Colegio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ColegioRepository extends JpaRepository<Colegio, Serializable> {
}
