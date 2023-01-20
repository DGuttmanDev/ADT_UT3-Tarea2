package es.adt.business.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
@Getter @Setter @ToString
public class Alumno implements Serializable {

    @Serial
    private static final long serialVersionUID = -639425186071681941L;

    public Alumno() {
    }

    public Alumno(String codigo, String nombre, String apellidos, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    private Long id;

    private String codigo;

    private String nombre;

    private String apellidos;

    private String telefono;

}
