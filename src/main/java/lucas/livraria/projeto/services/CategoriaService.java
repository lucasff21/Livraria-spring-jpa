package lucas.livraria.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lucas.livraria.projeto.entities.Categoria;
import lucas.livraria.projeto.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public List<Categoria> findAll(){
		return repo.findAll();
	}
	
	public Categoria findById(Long id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.get();
	}
}
