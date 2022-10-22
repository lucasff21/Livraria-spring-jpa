package lucas.livraria.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lucas.livraria.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
