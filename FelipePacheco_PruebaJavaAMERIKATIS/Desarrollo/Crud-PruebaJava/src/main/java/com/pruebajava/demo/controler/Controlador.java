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

import com.pruebajava.demo.interfaceService.ICursosService;
import com.pruebajava.demo.modelo.Cursos;

@Controller
@RequestMapping

public class Controlador {

	@Autowired
	private ICursosService service;
	
	@GetMapping ("/listar")
	public String listar(Model model) {
		List<Cursos>cursos = service.listar();
		model.addAttribute("cursos", cursos);
		return "index";
	}
	
	@GetMapping ("/new")
	public String agregar (Model model) {
		model.addAttribute("curso", new Cursos());
		return "form";
	}
	
	@PostMapping ("/save")
	public String save (@Validated Cursos c, Model model) {
		service.save(c);
		return "redirect:/listar";
		
	}
	
	@GetMapping ("/editar/{ID_Curso}")
	public String editar (@PathVariable int ID_Curso, Model model) {
		Optional<Cursos>curso = service.listarId(ID_Curso);
		model.addAttribute("curso", curso);
		return "form";
	}
	
	@GetMapping ("/eliminar/{ID_Curso}")
	public String delete (Model model, @PathVariable int ID_Curso) {
		service.delete(ID_Curso);
		return "redirect:/listar";
	}
	
	
	
}
