package es.adt.business.dao;

import es.adt.business.model.Asignatura;

public interface AsignaturaDAO {

    void saveAsignatura(Asignatura asignatura);

    Asignatura getAsignaturaByNombre(String nombreAsignatura);

}
