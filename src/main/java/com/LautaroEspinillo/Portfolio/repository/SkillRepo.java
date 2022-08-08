package com.LautaroEspinillo.Portfolio.repository;

import com.LautaroEspinillo.Portfolio.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository<Skill, Long> {
}
