package lucas.livraria.projeto.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lucas.livraria.projeto.entities.Livro;
import lucas.livraria.projeto.entities.Pedido;

@Embeddable
public class PedidoLivroPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "livro_id")
	private Livro livro;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(livro, pedido);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoLivroPK other = (PedidoLivroPK) obj;
		return Objects.equals(livro, other.livro) && Objects.equals(pedido, other.pedido);
	}
	
	
	
}
