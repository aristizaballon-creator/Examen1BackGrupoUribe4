package com.example.papaparchadAPP.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "empleados")

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombreEmpleado;
    private String eps;
    private String arl;
    private String telefono;
    private Double salarioBase;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getEps() {
        return eps;
    }
    public void setEps(String eps) {
        this.eps = eps;
    }
    public String getArl() {
        return arl;
    }
    public void setArl(String arl) {
        this.arl = arl;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
