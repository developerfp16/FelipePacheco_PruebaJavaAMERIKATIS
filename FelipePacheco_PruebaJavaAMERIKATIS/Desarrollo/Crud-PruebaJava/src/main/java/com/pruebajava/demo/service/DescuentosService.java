package com.pruebajava.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebajava.demo.interfaceService.IDescuentosServices;
import com.pruebajava.demo.interfaces.InterfaceDescuentos;
import com.pruebajava.demo.modelo.Descuentos;


@Service
public class DescuentosService implements IDescuentosServices {
	
	@Autowired
	private InterfaceDescuentos data;

	@Override
	public List<Descuentos> listardescuentos() {
		return (List<Descuentos>)data.findAll();
	}

	@Override
	public Optional<Descuentos> listarIdD(int idDescuentos) {
		return data.findById(idDescuentos);
	}

	@Override
	public int savedesc(Descuentos d) {
		int res=0;
		Descuentos descuento = data.save(d);
		
		if (!descuento.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deletedesc(int idDescuentos) {
		data.deleteById(idDescuentos);
		
	}
	
	
}
