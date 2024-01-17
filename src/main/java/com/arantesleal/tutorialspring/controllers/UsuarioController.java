package com.arantesleal.tutorialspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.arantesleal.tutorialspring.entities.Usuario;
import com.arantesleal.tutorialspring.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios") // mapeamento para acesso no navegador http://localhost:8080/usuarios
public class UsuarioController {
    @Autowired // permite injecao automatica de dependencias
    private UsuarioRepository repository;

    // Busca todos usuarios no banco de dados
    @GetMapping
    public List<Usuario> buscarTodos() {
        List<Usuario> resultado = repository.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}") // acrescenta caminho na url
    public Usuario buscarUsuario(@PathVariable Long id) {
        Usuario resultado = repository.findById(id).get();
        return resultado;
    }

    @PostMapping
    public Usuario inserirUsuario(@RequestBody Usuario usuario) {
        Usuario resultado = repository.save(usuario);
        return resultado;
    }
}
