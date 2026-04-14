package com.example.papaparchadAPP.modelos;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "pedidos")

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String numeroPedido;
    private Timestamp fechaCreacion;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
