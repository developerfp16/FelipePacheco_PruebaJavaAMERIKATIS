package com.pruebajava.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebajava.demo.interfaceService.IModalidadesService;
import com.pruebajava.demo.interfaces.InterfaceModalidades;
import com.pruebajava.demo.modelo.Modalidades;

@Service
public class ModalidadesService implements IModalidadesService {
	
	@Autowired
	private InterfaceModalidades data;
	
	@Override
	public List<Modalidades> listarmodalidades() {
		return (List<Modalidades>)data.findAll();
	}

	@Override
	public Optional<Modalidades> listarIdM(int idModalidad) {
		return data.findById(idModalidad);
	}

	@Override
	public int savemoda(Modalidades m) {
		int res=0;
		Modalidades modalidad = data.save(m);
		
		if (!modalidad.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deletemoda(int idModalidad) {
		data.deleteById(idModalidad);
	}
	
	
}
