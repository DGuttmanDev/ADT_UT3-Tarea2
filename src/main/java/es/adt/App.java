package es.adt;

import es.adt.business.model.Alumno;
import es.adt.business.model.Asignatura;
import es.adt.business.service.AlumnoService;
import es.adt.business.service.AsignaturaService;
import es.adt.business.service.impl.AlumnoServiceImpl;
import es.adt.business.service.impl.AsignaturaServiceImpl;

import java.util.List;
import java.util.Scanner;

public class App {

    private static AlumnoService alumnoService = AlumnoServiceImpl.getInstance();
    private static AsignaturaService asignaturaService = AsignaturaServiceImpl.getInstance();

    public static void main(String[] args){

        int selector = -1;

        while(selector != 0){

            System.out.println("\nElige una opcion: ");
            System.out.println("0- Salir");
            System.out.println("1- Agregar alumno");
            System.out.println("2- Mostrar listado de alumnos");
            System.out.println("3- Agregar asignatura");
            System.out.println("4- Mostrar informacion de asignatura");

            Scanner scanner = new Scanner(System.in);
            selector = scanner.nextInt();

            switch (selector){
                case 1 -> {
                    System.out.println("Codigo del alumno: ");
                    String codigo = scanner.next();
                    System.out.println("Nombre del alumno: ");
                    String nombre = scanner.next();
                    System.out.println("Apellidos del alumno: ");
                    String apellidos = scanner.next();
                    System.out.println("Telefono del alumno: ");
                    String numero = scanner.next();
                    alumnoService.addAlumno(new Alumno(codigo, nombre, apellidos, numero));
                }
                case 2 -> {
                    List<Alumno> alumnoList = alumnoService.getAlumnos();
                    for (Alumno alumno: alumnoList){
                        System.out.println(alumno);
                    }
                }
                case 3 -> {
                    System.out.println("Codigo de la asignatura: ");
                    String codigoAsignatura = scanner.next();
                    System.out.println("Nombre de la asignatura: ");
                    String nombreAsignatura = scanner.next();
                    System.out.println("Creditos de la asignatura: ");
                    int creditos = scanner.nextInt();
                    System.out.println("Es optativa (Si/No): ");
                    String optativaString = scanner.next();
                    boolean optativa;

                    if(optativaString.toLowerCase() == "si"){
                        optativa = true;
                    } else {
                        optativa = false;
                    }

                    asignaturaService.addAsignatura(new Asignatura(codigoAsignatura, nombreAsignatura, creditos, optativa));
                }
                case 4 -> {
                    System.out.println("Nombre de la asignatura a buscar: ");
                    String nombreAsignaturaBuscar = scanner.next();
                    System.out.println(asignaturaService.findAsignaturaByNombre(nombreAsignaturaBuscar));
                }

            }

        }

    }

}
