package com.cjava.demo.model.repositories;

import com.cjava.demo.model.docs.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursoRepository extends MongoRepository<Curso, String> {
}

