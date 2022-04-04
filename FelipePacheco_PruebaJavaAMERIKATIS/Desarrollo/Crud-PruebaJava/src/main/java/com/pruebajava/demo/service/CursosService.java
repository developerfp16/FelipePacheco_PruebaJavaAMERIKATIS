package com.pruebajava.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebajava.demo.interfaceService.ICursosService;
import com.pruebajava.demo.interfaces.InterfaceCursos;
import com.pruebajava.demo.modelo.Cursos;
@Service
public class CursosService implements ICursosService  {
	
	@Autowired
	private InterfaceCursos data;
	

	@Override
	public List<Cursos> listar() {
		return (List<Cursos>)data.findAll();
	}

	@Override
	public Optional<Cursos> listarId(int ID_Curso) {
		return data.findById(ID_Curso);
	}

	@Override
	public int save(Cursos c) {
		int res=0;
		Cursos curso = data.save(c);
		
		if (!curso.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int ID_Curso) {
		data.deleteById(ID_Curso);
		
	}

}
