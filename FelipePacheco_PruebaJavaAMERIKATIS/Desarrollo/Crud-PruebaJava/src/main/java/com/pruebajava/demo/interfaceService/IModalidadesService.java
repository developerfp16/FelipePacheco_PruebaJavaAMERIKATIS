package com.pruebajava.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.pruebajava.demo.modelo.Modalidades;

public interface IModalidadesService {
	
	public List<Modalidades> listarmodalidades();
	public Optional<Modalidades> listarIdM (int id);
	public int savemoda (Modalidades m);
	public void deletemoda (int id);

}
