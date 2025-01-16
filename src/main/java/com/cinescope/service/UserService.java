package com.cinescope.service;

import com.cinescope.model.User;
import com.cinescope.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Lista todos os usuários
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Busca usuário por e-mail
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // Adiciona um novo usuário
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
