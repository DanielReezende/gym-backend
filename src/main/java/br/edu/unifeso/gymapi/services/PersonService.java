package br.edu.unifeso.gymapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unifeso.gymapi.daos.PersonDao;
import br.edu.unifeso.gymapi.models.Person;

@Service
public class PersonService {
	@Autowired
	private PersonDao dao;

	public Person create(final Person person) {
		return this.dao.save(person);
	}

	public void delete(final Person person) {
		this.dao.delete(person);
	}

	public List<Person> list() {
		return this.dao.findAll();
	}

	public Person update(final Person person) {
		return this.dao.save(person);
	}
}
