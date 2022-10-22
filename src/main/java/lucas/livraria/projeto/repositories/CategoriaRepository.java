package lucas.livraria.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lucas.livraria.projeto.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
