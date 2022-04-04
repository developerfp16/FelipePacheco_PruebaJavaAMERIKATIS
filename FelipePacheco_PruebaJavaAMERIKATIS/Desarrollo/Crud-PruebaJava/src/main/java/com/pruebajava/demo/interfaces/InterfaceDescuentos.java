package com.pruebajava.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebajava.demo.modelo.Descuentos;

@Repository
public interface InterfaceDescuentos extends CrudRepository<Descuentos, Integer> {
	
}
