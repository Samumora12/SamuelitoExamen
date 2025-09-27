package com.example.parcial2.repositorios;


import com.example.parcial2.modelos.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISalaRepositorio extends JpaRepository<Sala, Integer> {

    List<Sala> FindbyCapacidad(Integer capacidad);

}
