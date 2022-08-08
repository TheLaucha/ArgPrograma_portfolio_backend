package com.LautaroEspinillo.Portfolio.repository;

import com.LautaroEspinillo.Portfolio.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Long> {
}
