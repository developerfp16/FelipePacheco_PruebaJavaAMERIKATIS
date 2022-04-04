package com.pruebajava.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebajava.demo.modelo.Cursos;

@Repository
public interface InterfaceCursos extends CrudRepository <Cursos, Integer> {

}

