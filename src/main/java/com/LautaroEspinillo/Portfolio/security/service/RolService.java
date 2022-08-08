package com.LautaroEspinillo.Portfolio.security.service;

import com.LautaroEspinillo.Portfolio.security.Enums.RolNombre;
import com.LautaroEspinillo.Portfolio.security.model.Rol;
import com.LautaroEspinillo.Portfolio.security.repository.RolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepo rolRepo;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepo.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        rolRepo.save(rol);
    }
}
