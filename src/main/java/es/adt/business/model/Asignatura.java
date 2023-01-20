package es.adt.business.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Getter @Setter @ToString
public class Asignatura implements Serializable {

    @Serial
    private static final long serialVersionUID = 8068414472146376686L;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, int creditos, boolean optativa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.optativa = optativa;
    }

    private Long id;

    private String codigo;

    private String nombre;

    private int creditos;

    private boolean optativa;

}
