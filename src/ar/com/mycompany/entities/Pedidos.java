package ar.com.mycompany.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedidos")

public class Pedidos implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idPedidos;

    @Temporal(javax.persistence.TemporalType.DATE)

    private Date fechaHoraCreacion;

    @Temporal(javax.persistence.TemporalType.DATE)

    private Date fechaHoraEntrega;
    private String nombreCliente;
    private boolean pendienteFactura;
    private int numeroPedidos;

    @JoinColumn(name = "fk_estadopedidos", referencedColumnName = "idEstadoPedidos", nullable = false)
    @ManyToOne

    private EstadoPedidos estadopedidos;

    @OneToMany(mappedBy = "pedidos", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<DetallePedidos> detalle = new ArrayList();

    public Pedidos() {

        detalle = new ArrayList<DetallePedidos>();

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
     * @return the idPedidos
     */
    public int getIdPedidos() {
        return idPedidos;
    }

    /**
     * @param idPedidos the idPedidos to set
     */
    public void setIdPedidos(int idPedidos) {
        this.idPedidos = idPedidos;
    }

    /**
     * @return the fechaHoraCreacion
     */
    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    /**
     * @param fechaHoraCreacion the fechaHoraCreacion to set
     */
    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    /**
     * @return the fechaHoraEntrega
     */
    public Date getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    /**
     * @param fechaHoraEntrega the fechaHoraEntrega to set
     */
    public void setFechaHoraEntrega(Date fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the numeroPedidos
     */
    public int getNumeroPedidos() {
        return numeroPedidos;
    }

    /**
     * @param numeroPedidos the numeroPedidos to set
     */
    public void setNumeroPedidos(int numeroPedidos) {
        this.numeroPedidos = numeroPedidos;
    }

    /**
     * @return the estadopedidos
     */
    public EstadoPedidos getEstadopedidos() {
        return estadopedidos;
    }

    /**
     * @param estadopedidos the estadopedidos to set
     */
    public void setEstadopedidos(EstadoPedidos estadopedidos) {
        this.estadopedidos = estadopedidos;
    }

    /**
     * @return the detalle
     */
    public List<DetallePedidos> getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(List<DetallePedidos> detalle) {
        this.detalle = detalle;
    }

    /**
     * @return the pendienteFactura
     */
    public boolean isPendienteFactura() {
        return pendienteFactura;
    }

    /**
     * @param pendienteFactura the pendienteFactura to set
     */
    public void setPendienteFactura(boolean pendienteFactura) {
        this.pendienteFactura = pendienteFactura;
    }

}