package ar.com.mycompany.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "estadopedidos")

public class EstadoPedidos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idEstadoPedidos;
    private String nombreEstadoPedidos;

    /**
     * @return the idEstadoPedidos
     */
    public int getIdEstadoPedidos() {
        return idEstadoPedidos;
    }

    /**
     * @param idEstadoPedidos the idEstadoPedidos to set
     */
    public void setIdEstadoPedidos(int idEstadoPedidos) {
        this.idEstadoPedidos = idEstadoPedidos;
    }

    /**
     * @return the nombreEstadoPedidos
     */
    public String getNombre() {
        return nombreEstadoPedidos;
    }

    public void setNombre(String nombre) {
        this.nombreEstadoPedidos = nombre;
    }


}
