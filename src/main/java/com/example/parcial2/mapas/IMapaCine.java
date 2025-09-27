package com.example.parcial2.mapas;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaCine {

    @Mapping(source = "nombre", target = "nombre")
    CineDto convertirModeloaDTO(Cine cine);

    List<CineDto> convertitListaDto(List<Cine> all);

    }



