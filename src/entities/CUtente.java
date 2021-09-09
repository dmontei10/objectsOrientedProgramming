package entities;

import java.util.List;

public class CUtente extends CPessoa implements Utente{
	
	private String faixaEtaria;
	private List<Marcacoes> marcacao;
	private List<CFamilia> familia;
	CFamilia cfamilia;
	
	
	public CUtente(String nome, String faixaEtaria) {
		super(nome);
		this.faixaEtaria = faixaEtaria;
	}
	
	public CUtente() {
		
	}

	@Override
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String listarUtente() {
		return nome + " " + faixaEtaria + "\n";
	}
	
	public String getfaixaEtaria() {
		return this.faixaEtaria;
	}
	
	public boolean temFamilia() {
		return true;
	}
	
	public Familia getFamilia(String nome) {
		Familia resFamilia = null;
		for(Familia fam : this.familia) {
			if(fam.getNomeFamilia() == nome) {
				resFamilia = fam;
			}
		}
		return resFamilia;
	}
	
	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public List<CFamilia> getFamilia() {
		return familia;
	}

	public void setFamilia(List<CFamilia> familia) {
		this.familia = familia;
	}

	public CFamilia getCfamilia() {
		return cfamilia;
	}

	public void setCfamilia(CFamilia cfamilia) {
		this.cfamilia = cfamilia;
	}

	public void setMarcacao(List<Marcacoes> marcacao) {
		this.marcacao = marcacao;
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
		return this.marcacao;
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


