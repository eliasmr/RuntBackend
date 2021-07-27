package com.co.runt.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ASIGNATURA_ESTUDIANTE")
public class AsignaturaXEstudiante {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="ID_ASIGNATURA")
    private Asignatura asignatura;

    @ManyToOne
    @JoinColumn(name="ID_ESTUDIANTE")
    private Estudiante estudiante;
}
