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

import com.pruebajava.demo.interfaceService.IModalidadesService;
import com.pruebajava.demo.modelo.Modalidades;

@Controller
@RequestMapping
public class ControladorModalidad {
	@Autowired
	private IModalidadesService servicemoda;
	
	@GetMapping ("/listarmodalidades")
	public String listar(Model model) {
		List<Modalidades>modalidades = servicemoda.listarmodalidades();
		model.addAttribute("modalidades", modalidades);
		return "modalidades";
	}
	
	@GetMapping ("/newmoda")
	public String agregar (Model model) {
		model.addAttribute("modalidad", new Modalidades());
		return "newmoda";
	}
	
	@PostMapping ("/savemoda")
	public String savemoda (@Validated Modalidades m, Model model) {
		servicemoda.savemoda(m);
		return "redirect:/listarmodalidades";
		
	}
	
	@GetMapping ("/editarmoda/{idModalidad}")
	public String editar (@PathVariable int idModalidad, Model model) {
		Optional<Modalidades>modalidad = servicemoda.listarIdM(idModalidad);
		model.addAttribute("modalidad", modalidad);
		return "newmoda";
	}
	
	@GetMapping ("/eliminarmoda/{idModalidad}")
	public String delete (Model model, @PathVariable int idModalidad) {
		servicemoda.deletemoda(idModalidad);
		return "redirect:/listarmodalidades";
	}
	
}
