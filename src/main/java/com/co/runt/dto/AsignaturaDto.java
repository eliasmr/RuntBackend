package com.co.runt.dto;

import com.co.runt.model.entity.Curso;
import com.co.runt.model.entity.Estudiante;
import com.co.runt.model.entity.Profesor;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AsignaturaDto {

    private String nombre;
    private Profesor profesor;
    private List<Estudiante> listEstudiante;
    private Curso curso;
}
