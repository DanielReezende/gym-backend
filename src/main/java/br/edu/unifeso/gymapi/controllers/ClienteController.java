package br.edu.unifeso.gymapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifeso.gymapi.exceptions.ItemAlreadyExistsException;
import br.edu.unifeso.gymapi.models.ClienteModel;
import br.edu.unifeso.gymapi.services.ClienteService;

@CrossOrigin("*")
@RestController
public class ClienteController {

	@Autowired
	ClienteService service;

	@GetMapping("/cliente")
	public List<ClienteModel> findAll() {
		return service.getAll();
	}

	@GetMapping("/cliente/{id}")
	public ClienteModel findById(@PathVariable String id) {
		return service.getById(id);
	}

	@PostMapping("/create")
	public ClienteModel create(@RequestBody ClienteModel entity) throws ItemAlreadyExistsException {
		return service.create(entity);
	}
}
