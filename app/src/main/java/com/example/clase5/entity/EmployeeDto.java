package com.example.clase5.entity;

import java.util.List;

public class EmployeeDto {

    private List<Employee> lista;
    private String estado;

    public List<Employee> getLista() {
        return lista;
    }

    public void setLista(List<Employee> lista) {
        this.lista = lista;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
