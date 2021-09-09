package entities;

import java.util.ArrayList;
import java.util.List;

public class CFaixaEtaria implements FaixaEtaria {

	private String nome;
	private int ordem;
	private List<Utente> faixaEtaria;
	
	
	public CFaixaEtaria(String nome, int ordem) {
		this.nome = nome;
		this.ordem = ordem;
		this.faixaEtaria = new ArrayList<Utente>();
	}

	public String getNome() {
		return this.nome;
		
	}
	public int getOrdem() {
		return ordem;
	}

	public List<Utente> getfaixaEtaria() {
		return this.faixaEtaria;
	}

}
