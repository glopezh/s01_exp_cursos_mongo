package com.cjava.demo.services;


import com.cjava.demo.model.docs.Curso;
import com.cjava.demo.model.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService{

    @Autowired
    CursoRepository cursoRepository;


    @Override
    public void registrarCurso(Curso curso) {
        cursoRepository.insert(curso);
    }

    @Override
    public void actualizarCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    @Override
    public void eliminarCurso(String id) {
        cursoRepository.deleteById(id);
    }

    @Override
    public List<Curso> listarCurso() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso buscarCurso(String id) {
        return cursoRepository.findById(id).orElse(null);
    }
}
