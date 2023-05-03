package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

//	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	@GetMapping(path = "/ola") // O @GetMapping atua como um atalho para @RequestMapping(method =
								// RequestMethod.GET), então estas duas annotations são praticamente a mesma
								// coisa, porém o @GetMapping SÓ é aplicável a métodos enquanto
								// @RequestMapping(method = RequestMethod.GET) pode ser aplicado à classes
								// também.
//	@GetMapping(path = { "/ola", "/saudacao" })
	public String ola() {
		return "Ola, Spring Boot";
	}

}
