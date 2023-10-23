package com.alvaro.springbootdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.alvaro.springbootdi.controllers.services.IServicio;

@Controller
public class IndexController {

	/* @Autowired inyecta un bean o componente en un atributo 
	 * Qualifier() ignora el @Primary */
	
	
	@Qualifier("ServicioComplejo")
	@Autowired 
	private IServicio servicio;

	@GetMapping({"/", "", "/index"})
	public String index (Model model) {
		
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}
}
