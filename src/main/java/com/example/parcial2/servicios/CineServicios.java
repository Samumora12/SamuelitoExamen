package com.example.parcial2.servicios;

import com.example.parcial2.ayudas.Error;
import com.example.parcial2.mapas.IMapaCine;
import com.example.parcial2.mapas.IMapaSala;
import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.CineDto;
import com.example.parcial2.modelos.dtos.SalaDto;
import com.example.parcial2.repositorios.ICineRepositorio;
import com.example.parcial2.repositorios.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public class CineServicios {

    @Autowired
    private ICineRepositorio repositorio;
    private IMapaCine mapa;


    public CineDto guardarCineDto(Cine cine) throws Exception { //Representa lo que manda el Fronent

        //Verifica si hay errores
        try{
            //Quiero intentar guardar un cine
            return this.mapa.convertirModeloaDTO(this.repositorio.save(cine));

        } catch (Exception error){
            throw new Exception(com.example.parcial2.ayudas.Error.ERROR_GENERAL_API.getDescripcion());
        }
    }

    //Buscar todos los datos por ID
    public  CineDto buscaCinePorId(Integer idCineBUSCAR) throws Exception {

        try {

            Optional<Cine> CineEncontrada = this.repositorio.findById(idCineBUSCAR);
            if (CineEncontrada.isPresent()){ //Lo encontre

                return this.mapa.convertirModeloaDTO(CineEncontrada.get());

            } else { //No lo encontre
                throw  new Exception("Sala no encontrada en la base de datos");
            }

        } catch (Exception error){
            throw new Exception(com.example.parcial2.ayudas.Error.ERROR_GENERAL_API.getDescripcion());
        }

    }

    // Buscar todos los registros de la tabla
    public List<CineDto> buscarCine() throws Exception{
        try{

            return this.mapa.convertitListaDto(this.repositorio.findAll());

        } catch (Exception error){
            throw new Exception(Error.ERROR_GENERAL_API.getDescripcion());
        }

    }

    //Buscar por Nombre
    public List<CineDto> BuscarNombreCine (String nombre) throws Exception{

        try {

            return this.mapa.convertitListaDto(this.repositorio.FindbyNombre(nombre));

        } catch (Exception error) {
            throw new Exception(Error.ERROR_GENERAL_API.getDescripcion());
        }

    }



}


