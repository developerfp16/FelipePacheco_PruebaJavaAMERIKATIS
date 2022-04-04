package com.pruebajava.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebajava.demo.modelo.Modalidades;

@Repository
public interface InterfaceModalidades extends CrudRepository <Modalidades, Integer> {

}
