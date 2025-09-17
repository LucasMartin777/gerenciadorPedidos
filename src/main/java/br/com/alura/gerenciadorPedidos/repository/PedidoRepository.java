package br.com.alura.gerenciadorPedidos.repository;

import br.com.alura.gerenciadorPedidos.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
