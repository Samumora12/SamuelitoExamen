package com.example.parcial2.servicios;

import com.example.parcial2.ayudas.Ciudad;
import com.example.parcial2.ayudas.Error;
import com.example.parcial2.mapas.IDetallesCine;
import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.modelos.dtos.CineDto;
import com.example.parcial2.modelos.dtos.DetallesCineDto;
import com.example.parcial2.repositorios.IDatellesCineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DetallesCineServicio {

    @Autowired
    private IDatellesCineRepositorio repositorio;
    private IDetallesCine mapa;


    public DetallesCineDto guardarCineDto(DetalleCine detalleCine) throws Exception { //Representa lo que manda el Fronent

        //Verifica si hay errores
        try{
            return this.mapa.convertirModeloaDTO(this.repositorio.save(detalleCine)); //Manda los datos del Usuario, Fron

        } catch (Exception error){
            throw new Exception(Error.ERROR_GENERAL_API.getDescripcion());
        }
    }


    //Buscar todos los datos por ID
    public  DetallesCineDto buscaDetalleporId(Integer idDetalleBUSCAR) throws Exception {

        try {

            Optional<DetalleCine> DetalleEncontrado = this.repositorio.findById(idDetalleBUSCAR);
            if (DetalleEncontrado.isPresent()){ //Lo encontre

                return this.mapa.convertirModeloaDTO(DetalleEncontrado.get());

            } else { //No lo encontre
                throw  new Exception("El detalle no se ha encontrado en la base de datos");
            }

        } catch (Exception error){
            throw new Exception(com.example.parcial2.ayudas.Error.ERROR_GENERAL_API.getDescripcion());
        }

    }

    // Buscar todos los registros de la tabla
    public List<DetallesCineDto> buscarDetalle() throws Exception{
        try{

            return this.mapa.convertitListaDto(this.repositorio.findAll());

        } catch (Exception error){
            throw new Exception(Error.ERROR_GENERAL_API.getDescripcion());
        }

    }

    //Buscar por Ciudad
    public List<DetallesCineDto> BuscarPorCiudad (Ciudad ciudad) throws Exception {

        try {

            return this.mapa.convertitListaDto(this.repositorio.FindbyCiudad(ciudad));

        } catch (Exception error) {
            throw new Exception(Error.ERROR_GENERAL_API.getDescripcion());
        }

    }

    //correcion
}
