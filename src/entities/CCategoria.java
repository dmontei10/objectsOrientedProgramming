package entities;

import java.util.List;

public class CCategoria implements Categoria {

	private String nome;
	private int ordem;
	private List<Profissional> categoria;
	
	public String getNome() {
		return this.nome;
	}
	
	public CCategoria(String nome, int ordem) {
		this.nome = nome;
		this.ordem = ordem;
	}
	
	public int getOrdem() {
		return ordem;
	}
	
	public List<Profissional> getCategoria() {
		return this.categoria;
	}

	

}
