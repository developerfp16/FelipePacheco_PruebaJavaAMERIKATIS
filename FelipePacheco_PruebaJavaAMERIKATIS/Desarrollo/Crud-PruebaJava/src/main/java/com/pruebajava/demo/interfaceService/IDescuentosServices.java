package com.pruebajava.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.pruebajava.demo.modelo.Descuentos;

public interface IDescuentosServices {
	public List<Descuentos> listardescuentos();
	public Optional<Descuentos> listarIdD (int id);
	public int savedesc (Descuentos d);
	public void deletedesc (int id);

}
