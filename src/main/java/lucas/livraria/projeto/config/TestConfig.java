package lucas.livraria.projeto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lucas.livraria.projeto.entities.Autor;
import lucas.livraria.projeto.entities.Categoria;
import lucas.livraria.projeto.entities.Livro;
import lucas.livraria.projeto.entities.Pedido;
import lucas.livraria.projeto.entities.PedidoLivro;
import lucas.livraria.projeto.entities.User;
import lucas.livraria.projeto.entities.enums.CategoriaLivro;
import lucas.livraria.projeto.repositories.AutorRepository;
import lucas.livraria.projeto.repositories.CategoriaRepository;
import lucas.livraria.projeto.repositories.LivroRepository;
import lucas.livraria.projeto.repositories.PedidoLivroRepository;
import lucas.livraria.projeto.repositories.PedidoRepository;
import lucas.livraria.projeto.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private AutorRepository autorRepository;
	
	@Autowired
	private CategoriaRepository catRepo;
	
	@Autowired
	private UserRepository userRepository;	
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PedidoLivroRepository pedidoLivroRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Autor autor1 = new Autor(null, "Paulo Coelho", "21/11/1997");
		
		Categoria cat1 = new Categoria(null, "Categoria baseada em livros de superação", CategoriaLivro.POESIA);
		Categoria cat2 = new Categoria(null, "Categoria baseada em livros de poesia", CategoriaLivro.GASTRONOMIA);
		Categoria cat3 = new Categoria(null, "Categoria baseada em livros de GASTRONOMIA", CategoriaLivro.DESENHO);
		Categoria cat4 = new Categoria(null, "Categoria baseada em livros de DESENHO", CategoriaLivro.FATOS_REAIS);
		Categoria cat5 = new Categoria(null, "Categoria baseada em livros de FATOS_REAIS", CategoriaLivro.ARTES);
		Categoria cat6 = new Categoria(null, "Categoria baseada em livros de ARTES", CategoriaLivro.ESTUDOS);
		Categoria cat7 = new Categoria(null, "Categoria baseada em livros de ESTUDOS", CategoriaLivro.AUTO_AJUDA);
		
		autorRepository.saveAll(Arrays.asList(autor1));
		catRepo.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
		
		
		Livro l1 = new Livro(null, "O Poder da ação", "Acorde para os objetivos que quer conquistar", 1000, 50.0, autor1, cat1);
		Livro l2 = new Livro(null, "O Alquimista", "Combinando espiritualidade, sabedoria e misticismo", 2000, 50.0, autor1, cat1);
		Livro l3 = new Livro(null, "Testando livro", "instanciando teste", 2000, 50.0, autor1, cat2);
		livroRepository.saveAll(Arrays.asList(l1, l2, l3));
		
		
		User u1 = new User(null, "Lucas França", "08260805537", "lucasfreitas_c5@gmail.com");

		userRepository.saveAll(Arrays.asList(u1));
		
		Pedido p1 = new Pedido(null, 1, u1);
		Pedido p2 = new Pedido(null, 100, u1);
		
		pedidoRepository.saveAll(Arrays.asList(p1, p2));
	
		
		PedidoLivro pedido1 = new PedidoLivro(p2, l1, null, null);
		
		pedidoLivroRepository.saveAll(Arrays.asList(pedido1));
		
	}

}
