package lucas.livraria.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lucas.livraria.projeto.entities.Pedido;
import lucas.livraria.projeto.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public List<Pedido> findAll(){
		return repo.findAll();
	}
	
	public Pedido findById(Long id) {
		Optional<Pedido> item = repo.findById(id);
		return item.get();
	}
	
	
	
}
