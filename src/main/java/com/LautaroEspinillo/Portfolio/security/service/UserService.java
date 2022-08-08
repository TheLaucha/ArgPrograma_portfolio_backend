package com.LautaroEspinillo.Portfolio.security.service;

import com.LautaroEspinillo.Portfolio.security.model.User;
import com.LautaroEspinillo.Portfolio.security.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepo userRepo;

    public Optional<User> getByUsername(String username){
        return userRepo.findByUsername(username);
    }

    public boolean existsByUsername(String username){
        return userRepo.existsByUsername(username);
    }

    public boolean existsByEmail(String email){
        return userRepo.existsByEmail(email);
    }

    public void save(User user){
        userRepo.save(user);
    }
}
