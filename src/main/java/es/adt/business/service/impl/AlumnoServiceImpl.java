package es.adt.business.service.impl;

import es.adt.business.dao.impl.AlumnoDAOImpl;
import es.adt.business.model.Alumno;
import es.adt.business.service.AlumnoService;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class AlumnoServiceImpl implements AlumnoService {

    private static AlumnoServiceImpl as;

    public static AlumnoServiceImpl getInstance() {
        if (as == null) {
            as = new AlumnoServiceImpl();
        }
        return as;
    }

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MainPersistence");

    private AlumnoDAOImpl alumnoDAO = new AlumnoDAOImpl(emf.createEntityManager());


    @Override
    public void addAlumno(Alumno alumno) {

        alumnoDAO.saveAlumno(alumno);

    }

    @Override
    public List<Alumno> getAlumnos() {

        return alumnoDAO.getAllAlumnos();

    }

}
