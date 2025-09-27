package com.example.parcial2.modelos.dtos;

import com.example.parcial2.ayudas.Tipo;

public class SalaDto {

    private String nombreSala;

    private Integer capaciad;

    private Tipo tipo;


    public SalaDto(String nombreSala, Integer capaciad, Tipo tipo) {
        this.nombreSala = nombreSala;
        this.capaciad = capaciad;
        this.tipo=tipo;
    }


    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public Integer getCapaciad() {
        return capaciad;
    }

    public void setCapaciad(Integer capaciad) {
        this.capaciad = capaciad;
    }
}
