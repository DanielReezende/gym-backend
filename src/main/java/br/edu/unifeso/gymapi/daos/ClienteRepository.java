package br.edu.unifeso.gymapi.daos;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.unifeso.gymapi.models.ClienteModel;

public interface ClienteRepository extends MongoRepository<ClienteModel, String> {
	Optional<ClienteModel> findByUsername(String username);
	
	Optional<ClienteModel> findById(String id);
}
