/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.mycompany.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pizzas")
public class Pizzas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idPizzas;
    private String nombre;
    private double precio;

    @JoinColumn(name = "fk_tipoPizzas", referencedColumnName = "idTipoPizzas", nullable = false)
    @ManyToOne

    private TipoPizzas tipoPizzas;

    @JoinColumn(name = "fk_variedadPizzas", referencedColumnName = "idVariedadPizzas", nullable = false)
    @ManyToOne

    private VariedadPizzas variedadPizzas;

    @JoinColumn(name = "fk_tamanioPizzas", referencedColumnName = "idTamanioPizzas", nullable = false)
    @ManyToOne

    private TamanioPizzas tamanioPizzas;

    public int getId() {
        return idPizzas;
    }

    public void setId(int id) {
        this.idPizzas = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoPizzas getTipopizza() {
        return tipoPizzas;
    }

    public void setTipopizza(TipoPizzas tipopizza) {
        this.tipoPizzas = tipopizza;
    }

    public VariedadPizzas getVariedadpizza() {
        return variedadPizzas;
    }

    public void setVariedadpizza(VariedadPizzas variedadpizza) {
        this.variedadPizzas = variedadpizza;
    }

    public TamanioPizzas getTamaniopizza() {
        return tamanioPizzas;
    }

    public void setTamaniopizza(TamanioPizzas tamaniopizza) {
        this.tamanioPizzas = tamaniopizza;
    }

}
