package lucas.livraria.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import lucas.livraria.projeto.entities.Autor;
import lucas.livraria.projeto.repositories.AutorRepository;

@Service
public class AutorService {

	@Autowired
	private AutorRepository repo;
	
	public List<Autor> findAll(){
		return repo.findAll();
	}
	
	public Autor findById(Long id) {
		Optional<Autor> obj = repo.findById(id);
		return obj.get();
	}
}
