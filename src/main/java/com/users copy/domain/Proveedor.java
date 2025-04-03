package com.app.proveedores.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "proveedores")
@Data
public class Proveedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String contacto;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String direccion;

    // Constructor vacío (requerido por JPA)
    public Proveedor() {}

    // Constructor con parámetros
    public Proveedor(String nombre, String contacto, String email, String direccion) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.email = email;
        this.direccion = direccion;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
