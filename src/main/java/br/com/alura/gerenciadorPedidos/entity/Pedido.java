package br.com.alura.gerenciadorPedidos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Pedido {
    @Id
    Long id;
    LocalDate data;

    public Pedido(LocalDate data) {
        this.data = data;
    }

    public Pedido() {
    }

    public Long getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }
}
