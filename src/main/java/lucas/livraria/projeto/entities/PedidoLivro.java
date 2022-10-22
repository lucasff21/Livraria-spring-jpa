package lucas.livraria.projeto.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lucas.livraria.projeto.entities.pk.PedidoLivroPK;

@Entity
@Table(name = "tb_pedido_livro")
public class PedidoLivro implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	 private PedidoLivroPK id = new PedidoLivroPK();
	 
	 private Integer quantidade;
	 private Double preco;
	 
	public PedidoLivro() {
	}

	public PedidoLivro(Pedido pedido, Livro livro,Integer quantidade, Double price) {
		super();
		id.setPedido(pedido);
		id.setLivro(livro);
		this.quantidade = quantidade;
		this.preco = price;
	}

	public Pedido getPedido() {
		return id.getPedido();
	}
	
	public void setPedido(Pedido pedido) {
		id.setPedido(pedido);
	}
	
	public Livro getLivro() {
		return id.getLivro();
	}
	
	public void setLivro(Livro livro) {
		id.setLivro(livro);
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double price) {
		this.preco = price;
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
		PedidoLivro other = (PedidoLivro) obj;
		return Objects.equals(id, other.id);
	}
	 
}
