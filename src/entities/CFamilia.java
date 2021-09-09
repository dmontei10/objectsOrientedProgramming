package entities;
import java.util.ArrayList;
import java.util.List;

public class CFamilia implements Familia {
	
	ArrayList <CUtente> utentes;
	private String nomeFamilia;

	public CFamilia(String nomeFamilia) {
		this.utentes = new ArrayList<CUtente>();
		this.nomeFamilia = nomeFamilia;
	}
	
	public String getNomeFamilia() {
		return this.nomeFamilia;
	}

	public List<Familia> getUtente() {
		return this.getUtente(); 
	}
	
	public boolean temUtente(Utente utente) {
		for(Familia obterUtente : this.getUtente()) {
			if(obterUtente.equals(utente)) {
				return true;
			}
		}
		return false;
	}

	public void addUtenteMember(CUtente utente) {
		this.utentes.add(utente);
	}

	public boolean temMarcacao() {
		return true;
	}
	
	public void remUtente(Familia familia) {
		this.getUtente().remove(familia);
	}

	
	public String listarFamilia() {
		return nomeFamilia +  "\n";
	}


	public String mostrarFamilia() {
		return nomeFamilia +  "\n" ;
	}

	@Override
	public void addUtente(Familia familia) {
		// TODO Auto-generated method stub
		
	}

}

