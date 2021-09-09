package entities;

import java.util.List;

public interface Categoria {

	public String getNome();
	public int getOrdem();
	List<Profissional> getCategoria();
	
}
