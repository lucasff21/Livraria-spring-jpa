package lucas.livraria.projeto.entities.enums;

public enum CategoriaLivro {

	POESIA(1),
	GASTRONOMIA(2),
	DESENHO(3),
	FATOS_REAIS(4),
	ARTES(5),
	ESTUDOS(6),
	AUTO_AJUDA(7);
	
	private int code;
	
	private CategoriaLivro(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static CategoriaLivro valueOf(int code) {
		for (CategoriaLivro x : CategoriaLivro.values()) {
			if(x.getCode() == code) {
				return x;
			}
		}
		throw new IllegalArgumentException("Codigo Invalido para categoria");
	}
}
