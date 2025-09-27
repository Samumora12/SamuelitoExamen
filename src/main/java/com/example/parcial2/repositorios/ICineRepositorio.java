package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICineRepositorio extends JpaRepository<Cine, Integer> {

    //Personalizando mis consultas de SQL con el JPA
    List<Cine> FindbyNombre(String nombre);



}
