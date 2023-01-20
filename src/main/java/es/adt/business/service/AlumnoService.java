package es.adt.business.service;

import es.adt.business.model.Alumno;

import java.util.List;

public interface AlumnoService {

    void addAlumno(Alumno alumno);

    List<Alumno> getAlumnos();

}
