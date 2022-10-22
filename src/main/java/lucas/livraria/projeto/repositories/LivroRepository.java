package lucas.livraria.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lucas.livraria.projeto.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
