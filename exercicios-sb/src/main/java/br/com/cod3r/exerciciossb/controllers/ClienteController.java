package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
//@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping(path = "/qualquer")
//	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Eduardo", "123.456.789-00");
	}

	@GetMapping(path = "/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Natany", "987-654-321-00");
	}

	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "Rafaela", "111-222-333-00");
	}

//	@GetMapping
//	public Cliente obterClientePorId3(@RequestParam(name = "id", defaultValue = "1") int id) {
//		return new Cliente(id, "Rafaela", "111-222-333-00");
//	}
}
