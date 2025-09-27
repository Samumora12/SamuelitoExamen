package com.example.parcial2.repositorios;

import com.example.parcial2.ayudas.Ciudad;
import com.example.parcial2.modelos.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDatellesCineRepositorio extends JpaRepository<DetalleCine, Integer> {

    List<DetalleCine> FindbyCiudad(Ciudad ciudad);
}
