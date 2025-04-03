package com.app.facturacion.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "facturas")
@Data
public class Facturacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String numeroFactura;

    @Column(nullable = false)
    private String cliente;

    @Column(nullable = false)
    private LocalDate fechaEmision;

    @Column(nullable = false)
    private BigDecimal montoTotal;

    @Column(nullable = false)
    private String estadoPago;

    // Constructor vacío (requerido por JPA)
    public Facturacion() {}

    // Constructor con parámetros
    public Facturacion(String numeroFactura, String cliente, LocalDate fechaEmision, BigDecimal montoTotal, String estadoPago) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.fechaEmision = fechaEmision;
        this.montoTotal = montoTotal;
        this.estadoPago = estadoPago;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }
}
