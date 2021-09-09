package entities;

import java.util.List;

public interface Familia {
	
	String getNomeFamilia();
	
	List<Familia> getUtente();
	
	boolean temUtente(Utente utente);

	void addUtente(Familia familia);
	
	boolean temMarcacao();
	
	void remUtente(Familia familia);
	
	String listarFamilia();
	
	String mostrarFamilia();
}
