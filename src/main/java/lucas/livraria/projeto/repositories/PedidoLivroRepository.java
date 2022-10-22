package lucas.livraria.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lucas.livraria.projeto.entities.PedidoLivro;

public interface PedidoLivroRepository extends JpaRepository<PedidoLivro, Long>{

}
