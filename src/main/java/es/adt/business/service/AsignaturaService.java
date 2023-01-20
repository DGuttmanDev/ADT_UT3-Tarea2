package es.adt.business.service;

import es.adt.business.model.Asignatura;

public interface AsignaturaService {

    void addAsignatura(Asignatura asignatura);

    Asignatura findAsignaturaByNombre(String nombreAsignatura);

}
