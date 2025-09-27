package com.example.parcial2.servicios;

import com.example.parcial2.ayudas.Error;
import com.example.parcial2.mapas.IMapaSala;
import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.SalaDto;
import com.example.parcial2.repositorios.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaServicios {

    @Autowired
    private ISalaRepositorio repositorio;
    private IMapaSala mapa;


    public SalaDto guardarSalaDto(Sala sala) throws Exception { //Representa lo que manda el Fronent

        //Verifica si hay errores
        try{
            //Quiero intentar guardar Usuario
            return this.mapa.convertirModeloaDTO(this.repositorio.save(sala)); //Manda los datos del Usuario, Fron

        } catch (Exception error){
            throw new Exception(Error.ERROR_GENERAL_API.getDescripcion());
        }
    }

    //Buscar todos los datos por ID
    public  SalaDto buscaSalaPorId(Integer idSalaBUSCAR) throws Exception {

        try {

            Optional<Sala> SalaEncontrada = this.repositorio.findById(idSalaBUSCAR);
            if (SalaEncontrada.isPresent()){ //Lo encontre

                return this.mapa.convertirModeloaDTO(SalaEncontrada.get());

            } else { //No lo encontre
                throw  new Exception("Sala no encontrada en la base de datos");
            }

        } catch (Exception error){
            throw new Exception(Error.ERROR_GENERAL_API.getDescripcion());
        }

    }

    // Buscar todos los registros de la tabla
    public List<SalaDto> buscarTodosEstudiantes() throws Exception{
        try{

            return this.mapa.convertitListaDto(this.repositorio.findAll());

        } catch (Exception error){
            throw new Exception(Error.ERROR_GENERAL_API.getDescripcion());
        }
    }

    //Buscar por Capacidad
    public List<SalaDto> BuscarSalaCapacidad (Integer capacidad) throws Exception{

        try {

            return this.mapa.convertitListaDto(this.repositorio.FindbyCapacidad(capacidad));

        } catch (Exception error) {
            throw new Exception(Error.ERROR_GENERAL_API.getDescripcion());
        }

    }

}
