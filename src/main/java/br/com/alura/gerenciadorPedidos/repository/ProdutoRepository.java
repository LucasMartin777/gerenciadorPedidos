package br.com.alura.gerenciadorPedidos.repository;

import br.com.alura.gerenciadorPedidos.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
}
