package ar.com.mycompany.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detallePedidos")
public class DetallePedidos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDetallePedidos;

    private int cantidadPedidos;
    private double precioPedidos;
    private double total;

    @JoinColumn(name = "fk_pizzas", referencedColumnName = "idPizzas", nullable = false)
    @ManyToOne

    private Pizzas pizzas;

    @JoinColumn(name = "fk_estadopedidos", referencedColumnName = "idEstadoPedidos", nullable = false)
    @ManyToOne

    private EstadoPedidos estadopedidos;

    @JoinColumn(name = "fk_pedidos", referencedColumnName = "idPedidos", nullable = false)
    @ManyToOne

    private Pedidos pedidos;

    public int getId() {
        return idDetallePedidos;
    }

    public void setId(int id) {
        this.idDetallePedidos = id;
    }

    public int getCantidad() {
        return cantidadPedidos;
    }

    public void setCantidad(int cantidad) {
        this.cantidadPedidos = cantidad;
    }

    public double getPrecio() {
        return precioPedidos;
    }

    public void setPrecio(double precio) {
        this.precioPedidos = precio;
    }

    public Pizzas getPizza() {
        return pizzas;
    }

    public void setPizza(Pizzas pizza) {
        this.pizzas = pizza;
    }

    public EstadoPedidos getEstadopedidos() {
        return estadopedidos;
    }

    public void setEstadopedidos(EstadoPedidos estadopedido) {
        this.estadopedidos = estadopedido;
    }

    /**
     * @return the pedidos
     */
    public Pedidos getPedidos() {
        return pedidos;
    }

    /**
     * @param pedidos the pedidos to set
     */
    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

}