package br.edu.unifeso.gymapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unifeso.gymapi.models.Person;
import br.edu.unifeso.gymapi.services.PersonService;

@CrossOrigin("*")
@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@PostMapping
	public Person create(@RequestBody final Person person) {
		return this.personService.create(person);
	}

	@DeleteMapping
	public void delete(@RequestBody final Person person) {
		this.personService.delete(person);
	}

	@GetMapping
	public List<Person> list() {
		return this.personService.list();
	}

	@PatchMapping
	public Person update(@RequestBody final Person person) {
		return this.personService.update(person);
	}
}
