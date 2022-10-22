package lucas.livraria.projeto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lucas.livraria.projeto.entities.Autor;
import lucas.livraria.projeto.services.AutorService;

@RestController
@RequestMapping(value = "/autores")
public class AutorResource {

	@Autowired
	private AutorService service;
	
	@GetMapping
	public ResponseEntity<List<Autor>> findAll(){
		List<Autor> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Autor> findById(@PathVariable Long id) {
		Autor obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

	}
	
}
