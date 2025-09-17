package br.com.alura.gerenciadorPedidos.repository;

import br.com.alura.gerenciadorPedidos.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}