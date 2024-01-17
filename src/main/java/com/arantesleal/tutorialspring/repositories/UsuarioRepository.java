package com.arantesleal.tutorialspring.repositories;

import com.arantesleal.tutorialspring.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
