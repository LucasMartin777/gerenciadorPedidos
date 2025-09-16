package br.com.alura.gerenciadorPedidos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Categoria {
    @Id
    Long id;
    String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
