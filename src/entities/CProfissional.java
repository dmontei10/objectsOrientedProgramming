package entities;

import java.util.List;

public class CProfissional extends CPessoa implements Profissional {

	private String categoria;
	private List<Marcacoes> marcacao;
	private List<Profissional> listaProfissionais;
	
	public CProfissional(String nome, String categoria) {
		this.categoria = categoria;
		this.nome = nome;
		
	}

	public String getCategoria() {
		return categoria;
	}
	
	public boolean temProfissional(String nome){
		for(Profissional profissional : this.getProfissionais()) {
			if(profissional.getNome() == nome) {
				return true;
			}
		}
		return false;
	}
	
	public void addProfissional(Profissional profissional) throws ProfissionalExc {
		if(this.temProfissional(profissional.getNome())) {
			throw new ProfissionalExc("Profissional existente.");
		}
		else {
			this.getProfissionais().add(profissional);
		}
	}
	
	public List<Profissional> getProfissionais() {
		return this.listaProfissionais;
	}
	
	public String listarProfissional() {
		return nome + " " + categoria + "\n";
	}
	
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public boolean temMarcacao(Marcacoes marcacoes) {
		for(Marcacoes marc : this.getMarcacao()) {
			if(marc.equals(marcacoes)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public List<Marcacoes> getMarcacao() {
		return marcacao;
	}

	@Override
	public void addMarcacao(Marcacoes marcacoes) {
		this.getMarcacao().add(marcacoes);
		
	}

	@Override
	public void remMarcacao(Marcacoes marcacoes) {
		this.getMarcacao().remove(marcacoes);
		
	}

	@Override
	public void limparMarcacao(Marcacoes marcacoes) {
		this.getMarcacao().clear();
	
	}
	
	
}
