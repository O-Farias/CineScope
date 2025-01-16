package com.cinescope.service;

import com.cinescope.model.User;
import com.cinescope.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    // Busca usuário por ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Adiciona um novo usuário
    public User addUser(User user) {
        return userRepository.save(user);
    }
}
