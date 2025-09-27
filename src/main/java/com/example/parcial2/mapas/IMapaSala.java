package com.example.parcial2.mapas;

import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.SalaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaSala {

    @Mapping(source = "nombreSala", target = "nombreSala")
    @Mapping(source = "capacidad", target = "capacidad")
    @Mapping(source = "tipo", target = "tipo")
    SalaDto convertirModeloaDTO(Sala sala);

    List<SalaDto> convertitListaDto(List<Sala> all);

    }




