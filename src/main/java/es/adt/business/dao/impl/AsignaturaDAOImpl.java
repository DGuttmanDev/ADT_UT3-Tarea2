package es.adt.business.dao.impl;

import es.adt.business.dao.AsignaturaDAO;
import es.adt.business.model.Asignatura;
import jakarta.persistence.EntityManager;

public class AsignaturaDAOImpl implements AsignaturaDAO {

    private EntityManager em;

    public AsignaturaDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void saveAsignatura(Asignatura asignatura) {

        try {
            em.getTransaction().begin();
            em.persist(asignatura);
            em.getTransaction().commit();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }

    }

    @Override
    public Asignatura getAsignaturaByNombre(String nombreAsignatura) {

        Asignatura asignatura;

        try{
            asignatura = em.createQuery("SELECT a FROM Asignatura a WHERE a.nombre LIKE :nombre", Asignatura.class)
                    .setParameter("nombre", nombreAsignatura)
                    .getSingleResult();
            return asignatura;
        } catch (Exception exception){
            System.err.println(exception.getMessage());
        }

        return null;

    }

}
