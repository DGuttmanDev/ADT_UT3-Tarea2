package es.adt.business.dao.impl;

import es.adt.business.dao.AlumnoDAO;
import es.adt.business.model.Alumno;
import es.adt.business.model.Asignatura;
import jakarta.persistence.EntityManager;

import java.util.List;

public class AlumnoDAOImpl implements AlumnoDAO {

    private EntityManager em;

    public AlumnoDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void saveAlumno(Alumno alumno) {

        try{
            em.getTransaction().begin();
            em.persist(alumno);
            em.getTransaction().commit();
        } catch (Exception exception){
            System.err.println(exception.getMessage());
        }

    }

    @Override
    public List<Alumno> getAllAlumnos() {

        try{

            List<Alumno> alumnosList;

            try{
                alumnosList = em.createQuery("SELECT a FROM Alumno a", Alumno.class).getResultList();
                return alumnosList;
            } catch (Exception exception){
                System.err.println(exception.getMessage());
            }
        } catch (Exception exception){
            System.err.println(exception.getMessage());
        }

        return null;
    }
}
