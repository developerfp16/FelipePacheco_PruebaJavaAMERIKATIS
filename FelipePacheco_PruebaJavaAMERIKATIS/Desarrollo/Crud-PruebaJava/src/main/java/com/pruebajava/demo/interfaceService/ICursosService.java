package com.pruebajava.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.pruebajava.demo.modelo.Cursos;

public interface ICursosService {
	public List<Cursos> listar();
	public Optional<Cursos> listarId (int id);
	public int save (Cursos c);
	public void delete (int id);
}
