package lucas.livraria.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lucas.livraria.projeto.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
