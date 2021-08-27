package com.practica.universidad.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practica.universidad.model.Equipo;
import com.practica.universidad.model.Facultad;
import com.practica.universidad.model.Investigadore;
import com.practica.universidad.model.Reserva;
import com.practica.universidad.service.EquipoService;
import com.practica.universidad.service.FacultadService;
import com.practica.universidad.service.InvestigadorService;
import com.practica.universidad.service.ReservaService;

@Controller
public class WebController {

	@Autowired
	private FacultadService facuService;
	
	@Autowired InvestigadorService invService;
	
	@Autowired EquipoService equService;
	
	@Autowired ReservaService resService;
	
	
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	
	//Inicio Facultades
	@GetMapping("/facultades")
	public String getFacultades(@Valid @ModelAttribute("facultad") Facultad facultad, BindingResult br,  Model model) {
		model.addAttribute("listaFacultades", facuService.listarFacultades());
		return "facultades";
	}
	
	@GetMapping("/crearfacultad")
	public String getCrearFacultad(Model model) {
		model.addAttribute("facultad", new Facultad());
		return "crearfacultad";
	}
	
	@PostMapping("/guardarFacultad")
	public String postCrearFacultad(@Valid @ModelAttribute("facultad") Facultad facultad, BindingResult br, Model model) {
		if (br.hasErrors()) {
			System.out.println(br.toString());
			return "crearfacultad";
		}
		facuService.agregar(facultad);
		model.addAttribute("listaFacultades", facuService.listarFacultades());
		return "redirect:/facultades";
	}
	
	@GetMapping("/modificarfacultad/{id}")
	public String getModificarFacultad(@PathVariable Integer id, Model model, @ModelAttribute("facultad") Facultad facultad) {
		model.addAttribute("facultad", facuService.listarFacultadPorModificar(id));
		return "modificarfacultad";
	}
	
	@PostMapping("/modificarFacultad")
	public String postModificarFacultad(@Valid @ModelAttribute("facultad") Facultad facultad, BindingResult br, Model model) {
		if (br.hasErrors()) {
			System.out.println(br.toString());
		}
		facuService.modificar(facultad);
		model.addAttribute("listaFacultades", facuService.listarFacultades());
		return "redirect:/facultades";
	}
	
	@RequestMapping(value = "/eliminarfacultad/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
	public String eliminarFacultad(@PathVariable Integer id, Model model, @ModelAttribute("facultad") Facultad facultad) {
		facuService.eliminar(id);
		model.addAttribute("listaFacultades", facuService.listarFacultades());
		return "redirect:/facultades";
	}
	
	//Fin facultades
	
	//Inicio investigadores
	@GetMapping("/investigadores")
	public String getInvestigadores(@Valid @ModelAttribute("investigadore") Investigadore investigadore, BindingResult br,  Model model) {
		
		model.addAttribute("listaInvestigadores", invService.listarInvestigadores());
		return "investigadores";
	}
	
	
	@GetMapping("/crearinvestigador")
	public String getCrearInvestigador(Model model) {
		model.addAttribute("investigador", new Investigadore());
		model.addAttribute("listaFacultades", facuService.listarFacultades());
		return "crearinvestigador";
	}
	
	@PostMapping("/guardarInvestigador")
	public String postCrearInvestigador(@Valid @ModelAttribute("investigador") Investigadore investigadore, BindingResult br, Model model) {
		if (br.hasErrors()) {
			System.out.println(br.toString());
			return "crearinvestigador";
		}
		invService.agregar(investigadore);
		model.addAttribute("listaInvestigadores", invService.listarInvestigadores());
		return "redirect:/investigadores";
	}
	
	
	@GetMapping("/modificarinvestigador/{id}")
	public String getModificarInvestigador(@PathVariable Integer id, Model model, @ModelAttribute("investigadore") Investigadore investigadore) {
		model.addAttribute("listaFacultades", facuService.listarFacultades());
		model.addAttribute("investigador", invService.listarInvestigadorPorModificar(id));
		return "modificarinvestigador";
	}
	
	@PostMapping("/modificarInvestigador")
	public String postModificarInvestigador(@Valid @ModelAttribute("investigador") Investigadore investigadore, BindingResult br, Model model) {
		if (br.hasErrors()) {
			System.out.println(br.toString());
		}
		invService.modificar(investigadore);
		model.addAttribute("listaInvestigadores", invService.listarInvestigadores());
		return "redirect:/investigadores";
	}
	
	@RequestMapping(value = "/eliminarinvestigador/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
	public String eliminarInvestigador(@PathVariable Integer id, Model model, @ModelAttribute("investigador") Investigadore investigadore) {
		invService.eliminar(id);
		model.addAttribute("listaInvestigadores", invService.listarInvestigadores());
		return "redirect:/investigadores";
	}
	
	//Fin investigadores
	
	@GetMapping("/equipos")
	public String getEquipos(@Valid @ModelAttribute("equipos") Equipo equipo, BindingResult br, Model model) {
		
		model.addAttribute("listaEquipos", equService.listarEquipos());
		return "equipos";
	}
	
	@GetMapping("/reservas")
	public String getReservas(@Valid @ModelAttribute("reservas") Reserva reserva, BindingResult br, Model model) {
		
		model.addAttribute("listaReservas", resService.listarReservas());
		return "reservas";
	}
}
