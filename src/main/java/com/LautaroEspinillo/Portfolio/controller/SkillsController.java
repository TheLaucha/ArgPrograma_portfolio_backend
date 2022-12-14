package com.LautaroEspinillo.Portfolio.controller;

import com.LautaroEspinillo.Portfolio.model.Skill;
import com.LautaroEspinillo.Portfolio.security.service.SkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/skills")
public class SkillsController {
    private final SkillService skillService;

    public SkillsController(SkillService skillService){
        this.skillService = skillService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skill>> getAllSkills(){
        List<Skill> skills = skillService.findAllSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Skill> getSkillById(@PathVariable("id") Long id){
        Skill skill = skillService.findSkill(id);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PostMapping("/add")
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill){
        Skill newSkill = skillService.addSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @PutMapping("/update")
    public ResponseEntity<Skill> updateSkill(@RequestBody Skill skill){
        Skill updateSkill = skillService.updateSkill(skill);
        return new ResponseEntity<>(updateSkill,HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')") */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id){
        skillService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
