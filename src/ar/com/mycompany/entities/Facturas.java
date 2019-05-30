/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.mycompany.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Leo
 */
@Entity
@Table(name = "facturas")

public class Facturas implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFacturas;
    private int numero;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaHoraEmision;


    @JoinColumn(name = "pedido_id", referencedColumnName = "idPedidos", nullable = false)
    @ManyToOne(optional = false, cascade = {CascadeType.ALL})

    private Pedidos pedido;

    @JoinColumn(name = "estado_id", referencedColumnName = "idEstadoFacturas", nullable = false)
    @ManyToOne(optional = false, cascade = {CascadeType.ALL})
    private EstadoFacturas estado;

    public Facturas() {
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the idFacturas
     */
    public int getIdFacturas() {
        return idFacturas;
    }

    /**
     * @param idFacturas the idFacturas to set
     */
    public void setIdFacturas(int idFacturas) {
        this.idFacturas = idFacturas;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the fechaHoraEmision
     */
    public Date getFechaHoraEmision() {
        return fechaHoraEmision;
    }

    /**
     * @param fechaHoraEmision the fechaHoraEmision to set
     */
    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    /**
     * @return the pedido
     */
    public Pedidos getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the estado
     */
    public EstadoFacturas getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoFacturas estado) {
        this.estado = estado;
    }


}
