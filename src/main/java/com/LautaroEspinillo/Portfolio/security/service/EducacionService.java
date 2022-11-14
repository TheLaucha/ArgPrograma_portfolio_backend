package com.LautaroEspinillo.Portfolio.security.service;

import com.LautaroEspinillo.Portfolio.model.Educacion;
import com.LautaroEspinillo.Portfolio.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public List<Educacion> findAllEducacion(){
        return educacionRepo.findAll();
    }

    public Educacion updateEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public void deleteEducacion(Long id){
        educacionRepo.deleteById(id);
    }

    public Educacion findEducacion(Long id){
        return educacionRepo.findById(id).orElse(null);
    }
}
