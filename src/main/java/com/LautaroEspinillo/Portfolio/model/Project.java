package com.LautaroEspinillo.Portfolio.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
    private String liveDemoUrl;
    private String githubRepo;

    public Project(){

    }

    public Project(String name, String description, String imageUrl, String liveDemoUrl, String githubRepo) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.liveDemoUrl = liveDemoUrl;
        this.githubRepo = githubRepo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLiveDemoUrl() {
        return liveDemoUrl;
    }

    public void setLiveDemoUrl(String liveDemoUrl) {
        this.liveDemoUrl = liveDemoUrl;
    }

    public String getGithubRepo() {
        return githubRepo;
    }

    public void setGithubRepo(String githubRepo) {
        this.githubRepo = githubRepo;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", liveDemoUrl='" + liveDemoUrl + '\'' +
                ", githubRepo='" + githubRepo + '\'' +
                '}';
    }
}
