package com.example.parcial2.ayudas;

public enum Error {

    USUARIO_NO_ENCONTRADO("El usuario no se encuentra en la base de datos"),
    ERROR_GENERAL_API("Fallamos, el API tuvo un problema")
    ;

    private final String descripcion;

    Error(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
