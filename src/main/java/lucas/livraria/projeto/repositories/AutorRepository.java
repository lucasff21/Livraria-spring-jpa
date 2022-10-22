package lucas.livraria.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lucas.livraria.projeto.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{

}
