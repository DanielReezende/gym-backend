package br.edu.unifeso.gymapi.daos;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.edu.unifeso.gymapi.models.Exercise;

public interface ExerciseDao extends MongoRepository<Exercise, String> {

}
