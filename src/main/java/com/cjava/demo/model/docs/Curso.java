package com.cjava.demo.model.docs;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cursos")
public record Curso(String id, String nombre, int creditos) {
}
