package com.cinescope.repository;

import com.cinescope.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Método personalizado para buscar usuário pelo e-mail
    User findByEmail(String email);
}
