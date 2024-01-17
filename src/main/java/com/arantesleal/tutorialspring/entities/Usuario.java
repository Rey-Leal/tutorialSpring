package com.arantesleal.tutorialspring.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario")

public class Usuario {
    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto incremento
    private Long id;
    private String nome;
    private String email;

    @ManyToOne // Relacionamento de varios para um
    @JoinColumn(name = "departamento_id") // coluna referenciada
    private Departamento departamento;

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
