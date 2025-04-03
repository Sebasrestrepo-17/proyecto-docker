package com.app.envios.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "envios")
@Data
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String destinatario;

    @Column(nullable = false)
    private String direccionEntrega;

    @Column(nullable = false)
    private LocalDate fechaEnvio;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false, unique = true)
    private String numeroGuia;

    // Constructor vacío (requerido por JPA)
    public Envio() {}

    // Constructor con parámetros
    public Envio(String destinatario, String direccionEntrega, LocalDate fechaEnvio, String estado, String numeroGuia) {
        this.destinatario = destinatario;
        this.direccionEntrega = direccionEntrega;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.numeroGuia = numeroGuia;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }
}
