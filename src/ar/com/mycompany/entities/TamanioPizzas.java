package ar.com.mycompany.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tamanioPizzas")

public class TamanioPizzas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idTamanioPizzas;
    private int cantPorciones;
    private String nombre;

    public int getId() {
        return idTamanioPizzas;
    }

    public void setId(int id) {
        this.idTamanioPizzas = id;
    }

    public int getCantPorciones() {
        return cantPorciones;
    }

    public void setCantPorciones(int cantPorciones) {
        this.cantPorciones = cantPorciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
