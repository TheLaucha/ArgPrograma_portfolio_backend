package com.LautaroEspinillo.Portfolio.security.service;

import com.LautaroEspinillo.Portfolio.model.Persona;

import java.util.List;

public interface IPersonaService {
    List<Persona> getPersona();

    void savePersona(Persona persona);

    void deletePersona(Long id);

    Persona findPersona(Long id);
}
