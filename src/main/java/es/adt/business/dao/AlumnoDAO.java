package es.adt.business.dao;

import es.adt.business.model.Alumno;

import java.util.List;

public interface AlumnoDAO {

    void saveAlumno(Alumno alumno);

    List<Alumno> getAllAlumnos();

}
