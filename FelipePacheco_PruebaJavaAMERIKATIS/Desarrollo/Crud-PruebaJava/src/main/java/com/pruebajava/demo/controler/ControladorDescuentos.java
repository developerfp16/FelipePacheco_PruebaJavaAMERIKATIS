package com.pruebajava.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pruebajava.demo.interfaceService.IDescuentosServices;
import com.pruebajava.demo.modelo.Descuentos;


@Controller
@RequestMapping
public class ControladorDescuentos {
	
	@Autowired
	private IDescuentosServices servicedesc;
	
	@GetMapping ("/listardescuento")
	public String listar(Model model) {
		List<Descuentos>descuentos = servicedesc.listardescuentos();
		model.addAttribute("descuentos", descuentos);
		return "descuentos";
	}
	
	@GetMapping ("/newdesc")
	public String agregar (Model model) {
		model.addAttribute("descuento", new Descuentos());
		return "newdesc";
	}
	
	@PostMapping ("/savedesc")
	public String savedesc (@Validated Descuentos d, Model model) {
		servicedesc.savedesc(d);
		return "redirect:/listardescuento";
		
	}
	
	@GetMapping ("/editardesc/{idDescuentos}")
	public String editar (@PathVariable int idDescuentos, Model model) {
		Optional<Descuentos>descuento = servicedesc.listarIdD(idDescuentos);
		model.addAttribute("descuento", descuento);
		return "newdesc";
	}
	
	@GetMapping ("/eliminardesc/{idDescuentos}")
	public String delete (Model model, @PathVariable int idDescuentos) {
		servicedesc.deletedesc(idDescuentos);
		return "redirect:/listardescuento";
	}
	

}
