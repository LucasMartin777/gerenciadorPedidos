package br.com.alura.gerenciadorPedidos;


import br.com.alura.gerenciadorPedidos.entity.Categoria;
import br.com.alura.gerenciadorPedidos.entity.Pedido;
import br.com.alura.gerenciadorPedidos.entity.Produto;
import br.com.alura.gerenciadorPedidos.repository.CategoriaRepository;
import br.com.alura.gerenciadorPedidos.repository.PedidoRepository;
import br.com.alura.gerenciadorPedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Principal implements CommandLineRunner {

    @Autowired// anotacao para o spring fazer o gerenciamento da injecao.
    private ProdutoRepository produtoRepository;

    @Autowired// anotacao para o spring fazer o gerenciamento da injecao.
    private PedidoRepository pedidoRepository;

    @Autowired// anotacao para o spring fazer o gerenciamento da injecao.
    private CategoriaRepository categoriaRepository;


    public static void main(String[] args) {
        SpringApplication.run(Principal.class, args);
    }


    @Override
    public void run(String... args) throws Exception {


        Pedido pedido1 = new Pedido(2L, LocalDate.now());
        Pedido pedido2 = new Pedido(3L, LocalDate.now().minusDays(2));
        Pedido pedido3 = new Pedido(4L, LocalDate.now().minusWeeks(1));



        pedidoRepository.save(pedido1);
        pedidoRepository.save(pedido2);
        pedidoRepository.save(pedido3);
    }
}
