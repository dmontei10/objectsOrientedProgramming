package entities;

public interface Utente extends Pessoa {
	
	String getNome();
	
	String getfaixaEtaria();
	
	public String listarUtente();
	
	boolean temFamilia();
	
	Familia getFamilia(String nome);
	
}
