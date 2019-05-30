package ar.com.mycompany.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Leo
 */
@Entity
@Table(name = "estadofacturas")

public class EstadoFacturas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idEstadoFacturas;
    private String nombre;

    /**
     * @return the idEstadoFacturas
     */
    public int getIdEstadoFacturas() {
        return idEstadoFacturas;
    }

    /**
     * @param idEstadoFacturas the idEstadoFacturas to set
     */
    public void setIdEstadoFacturas(int idEstadoFacturas) {
        this.idEstadoFacturas = idEstadoFacturas;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
