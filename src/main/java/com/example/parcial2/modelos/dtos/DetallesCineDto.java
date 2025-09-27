package com.example.parcial2.modelos.dtos;

import com.example.parcial2.ayudas.Ciudad;

public class DetallesCineDto {

    public Ciudad ciudad;

    public String direccion;

    public DetallesCineDto(){

    }

    public DetallesCineDto(Ciudad ciudad, String direccion) {
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
