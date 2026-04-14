package com.example.papaparchadAPP.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ventas")

public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String idPedido;
    private Integer monto;
    private String metodoPago;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }
    public Integer getMonto() {
        return monto;
    }
    public void setMonto(Integer monto) {
        this.monto = monto;
    }
    public String getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }


}
