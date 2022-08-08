package com.LautaroEspinillo.Portfolio.security.repository;

import com.LautaroEspinillo.Portfolio.security.Enums.RolNombre;
import com.LautaroEspinillo.Portfolio.security.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepo extends JpaRepository<Rol,Long> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
