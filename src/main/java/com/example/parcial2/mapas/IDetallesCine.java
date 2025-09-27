package com.example.parcial2.mapas;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.modelos.dtos.DetallesCineDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IDetallesCine {

    @Mapping(source = "ciudad", target = "ciudad")
    @Mapping(source = "direccion", target = "direccion")
    DetallesCineDto convertirModeloaDTO(DetalleCine DetalleCine);

    List<DetallesCineDto> convertitListaDto(List<DetalleCine> all);

}
