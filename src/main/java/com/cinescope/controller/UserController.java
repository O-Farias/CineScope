package com.cinescope.controller;

import com.cinescope.model.User;
import com.cinescope.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Endpoint para listar todos os usuários
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Endpoint para buscar usuário por e-mail
    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    // Endpoint para adicionar um novo usuário
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
