package ar.com.mycompany.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipoPizzas")

public class TipoPizzas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idTipoPizzas;
    private String descripcion;
    private String nombre;

    public long getId() {
        return idTipoPizzas;
    }

    public void setId(int id) {
        this.idTipoPizzas = id;
    }

    public String getDescrip() {
        return descripcion;
    }

    public void setDescrip(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
