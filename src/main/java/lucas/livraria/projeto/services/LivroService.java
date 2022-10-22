package lucas.livraria.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lucas.livraria.projeto.entities.Livro;
import lucas.livraria.projeto.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository repo;
	
	public List<Livro> findAll(){
		return repo.findAll();
	}
	
	public Livro findById(Long id) {
		Optional<Livro> item = repo.findById(id);
		return item.get();
	}
	
	public Livro insert(Livro item) {
		return repo.save(item);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);;
	}
	
	public Livro update(Long id, Livro item) {
		Livro value = repo.getReferenceById(id);
		updateData(value, item);
		return repo.save(value);
	}
	
	private void updateData(Livro value, Livro item) {
		value.setNome(item.getNome());
		value.setQuantidadeEstoque(item.getQuantidadeEstoque());
		value.setResumo(item.getResumo());
	}
}
