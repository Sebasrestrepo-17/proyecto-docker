package com.app.users.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "inventario")
@Data
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String producto;

    @Column(nullable = false, unique = true)
    private int cantidad;

    @Column(nullable = false)
    private String marca;

    // Empty constructor (required for JPA)
    public Inventario() {}

    // Constructor with parameters
    public Inventario(Long id, String producto, int cantidad, String marca) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}