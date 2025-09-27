package com.example.parcial2.modelos.dtos;

public class CineDto {

    private String nombre;

    public  CineDto(){

    }

    public CineDto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
