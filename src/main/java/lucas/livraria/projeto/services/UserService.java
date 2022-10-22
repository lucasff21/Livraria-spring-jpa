package lucas.livraria.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lucas.livraria.projeto.entities.User;
import lucas.livraria.projeto.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> item = repo.findById(id);
		return item.get();
	}
	
	public User insert(User item) {
		return repo.save(item);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);;
	}
	
	public User update(Long id, User item) {
		User value = repo.getReferenceById(id);
		updateData(value, item);
		return repo.save(value);
	}
	
	private void updateData(User value, User item) {
		value.setNome(item.getNome());
		value.setCpf(item.getCpf());
		value.setEmail(item.getEmail());
	
	}
}
