package entities;

import java.util.List;

public interface Profissional extends Pessoa {
	
	String getNome();
	
	public String getCategoria();
	
	List<Profissional> getProfissionais();
	
	public String listarProfissional();
	
	List<Marcacoes> getMarcacao();

}
