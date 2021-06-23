package br.edu.unifeso.gymapi.daos;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.unifeso.gymapi.models.Person;

public interface PersonDao extends MongoRepository<Person, String> {

}
