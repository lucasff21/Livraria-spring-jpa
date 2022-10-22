package lucas.livraria.projeto.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lucas.livraria.projeto.entities.enums.CategoriaLivro;

@Entity
@Table(name = "tb_categoria")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String resumoCategoria;
	private Integer categoriaLivro;
	
	@OneToMany(mappedBy = "categoria")
	private List<Livro> livros = new ArrayList<>();

	public Categoria() {
	}

	public Categoria(Long id, String resumoCategoria, CategoriaLivro categoriaLivro) {
		super();
		this.id = id;
		this.resumoCategoria = resumoCategoria;
		setCategoriaLivro(categoriaLivro);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getResumoCategoria() {
		return resumoCategoria;
	}

	public void setResumoCategoria(String resumoCategoria) {
		this.resumoCategoria = resumoCategoria;
	}

	public CategoriaLivro getCategoriaLivro() {
		return CategoriaLivro.valueOf(categoriaLivro);
	}

	public void setCategoriaLivro(CategoriaLivro categoriaLivro) {
		if(categoriaLivro != null) {
			this.categoriaLivro = categoriaLivro.getCode();
		}
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public Integer getQuantidadeTotal() {
		int x = 0;
		for (Livro value : livros) {
			x  += value.getQuantidadeEstoque();
		}
		return x;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}
}
