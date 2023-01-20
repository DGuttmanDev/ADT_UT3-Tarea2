package es.adt.business.service.impl;

import es.adt.business.dao.AsignaturaDAO;
import es.adt.business.dao.impl.AsignaturaDAOImpl;
import es.adt.business.model.Asignatura;
import es.adt.business.service.AlumnoService;
import es.adt.business.service.AsignaturaService;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AsignaturaServiceImpl implements AsignaturaService {

    private static AsignaturaServiceImpl as;

    public static AsignaturaServiceImpl getInstance(){
        if(as == null){
            as = new AsignaturaServiceImpl();
        }
        return as;
    }

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("MainPersistence");

    private AsignaturaDAO asignaturaDAO = new AsignaturaDAOImpl(emf.createEntityManager());

    @Override
    public void addAsignatura(Asignatura asignatura) {

        asignaturaDAO.saveAsignatura(asignatura);

    }

    @Override
    public Asignatura findAsignaturaByNombre(String nombreAsignatura) {

        return asignaturaDAO.getAsignaturaByNombre(nombreAsignatura);
    }
}
