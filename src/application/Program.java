package application;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

import entities.CCategoria;
import entities.CFaixaEtaria;
import entities.CFamilia;
import entities.CMarcacoes;
import entities.CProfissional;
import entities.CServicos;
import entities.CUtente;
import entities.Profissional;
import entities.ProfissionalExc;
import entities.Utente;

public class Program {
	
	public static void main(String[] args) throws FileNotFoundException {
	
	List<CMarcacoes> marcacao = new ArrayList<>();
	List<CServicos> servico = new ArrayList<>();
	List<CFamilia> familias = new ArrayList<>();
	List<CProfissional> profMed = new ArrayList<>();
	List<CProfissional> profEnf = new ArrayList<>();
	List<CProfissional> profAux = new ArrayList<>();
	List<CUtente> utentes = new ArrayList<>();
	
	CCategoria catMedicina = new CCategoria("Medicina", 1);
	CCategoria catEnfermagem = new CCategoria("Enfermagem", 2);
	CCategoria catAuxiliar = new CCategoria("Auxiliar", 3);
	
	CFaixaEtaria jovem = new CFaixaEtaria("Jovem", 1);
	CFaixaEtaria adulto = new CFaixaEtaria("Adulto", 2);
	CFaixaEtaria idoso = new CFaixaEtaria("Idoso", 3);
	

	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	while (true){
		
		
		String opcao = sc.nextLine();
		if (opcao.equals("RP")) {	
				String categoria = sc.next();
				String nome = sc.next();
				System.out.println();
					
				if(categoria.equals(catMedicina.getNome())) {
				
					CProfissional profMedicina = new CProfissional(categoria, nome);;
					profMed.add(profMedicina);
					System.out.println("Profissional registado com sucesso");
				
				}
		
				else if (categoria.equals(catEnfermagem.getNome())) {
				
					CProfissional profEnfermagem = new CProfissional(categoria, nome);
					profEnf.add(profEnfermagem);
					System.out.println("Profissional registado com sucesso.");
				}
				
				else if (categoria.equals(catAuxiliar.getNome())) {
					CProfissional profAuxiliar = new CProfissional(categoria, nome);
					profAux.add(profAuxiliar);
					System.out.println("Profissional registado com sucesso.");
				}
				
		
	}
	
		
		if (opcao.equals("LP")) {
		
			for (CProfissional profMed1 : profMed) {
                System.out.print(profMed1.listarProfissional());
            }
            for (CProfissional profEnf1 : profEnf) {
                System.out.print(profEnf1.listarProfissional());
            }
            for (CProfissional profAux1 : profAux) {
                System.out.print(profAux1.listarProfissional());
            }	
		}
            
		if (opcao.equals("RU")) {
			String nome = sc.next();
			String faixaEtariaUtente = sc.next();
			if(faixaEtariaUtente.equals(jovem.getNome())) {
				
				CUtente uJovem = new CUtente(nome, faixaEtariaUtente);;
				utentes.add(uJovem);
				System.out.println("Utente registado com sucesso.");
				}
			else if (faixaEtariaUtente.equals(adulto.getNome())) {
				
				CUtente uAdulto = new CUtente(nome, faixaEtariaUtente);
				utentes.add(uAdulto);
				System.out.println("Utente registado com sucesso.");
				}
			else if (faixaEtariaUtente.equals(idoso.getNome())) {
				CUtente uIdoso = new CUtente(nome, faixaEtariaUtente);
				utentes.add(uIdoso);
				System.out.println("Utente registado com sucesso.");
			}
		}
		
		if (opcao.equals("RF")) {
			
			String nomeFamilia = sc.next();
			
				CFamilia rFamilia = new CFamilia(nomeFamilia);
				familias.add(rFamilia);
				System.out.println("Família registada com sucesso.");
				}
		
		if (opcao.equals("LU")) {
			
			for (CUtente utente1 : utentes) {
                System.out.print(utente1.listarUtente());
            }
		}
		
			if (opcao.equals("AF")) {
				String nome = sc.next();
				String nomeFamilia = sc.next();
				Boolean utenteExiste = false;
				
				for(CUtente utente :  utentes) {
					if(nome.equals(utente.nome)) {
						utenteExiste = true;
						for(CFamilia familia :  familias) {
							if(nomeFamilia.equals(familia.getNomeFamilia())) {
								familia.addUtenteMember(utente);
								System.out.println("Utente associado a família");
							}
						} 
					}
						
				}
				
				if(!utenteExiste) {
					System.out.println("Utente inexistente");
				}
				
				
					
				
				
			
			
			}
			
		
		if (opcao.equals("MF")) {
			System.out.println("Selecione a família que deseja ver: ");
			String mFamilia = sc.next();
			
			
			}
		
		
		
		
		if (opcao.equals("LF")) {
			
			for (CFamilia familia1 : familias) {
                System.out.print(familia1.listarFamilia());
            }
			

		}
		
		if (opcao.equals("G")) {
		try (PrintWriter out = new PrintWriter("filename.txt")) {
			
			for (CProfissional profMed1 : profMed) {
				out.println(profMed1.getNome());
                out.print(" ");
                out.print(profMed1.getCategoria());
                System.out.println("Unidade de saúde gravada.");
                
            }
	            
			}
			
		}
		if (opcao.equals("X")) {
			System.out.println("A encerrar o programa...");
			break;
		}
		}

	
	
	
	sc.close();	}

	}	

			
			/*Adicionar Utente
			System.out.println();
			System.out.println("Nome do utente: ");
			String nomeUtente = sc.nextLine();
			System.out.println("Faixa Etária do utente: ");
			String faixaEtaria = sc.nextLine();
			
			CUtente utent = new CUtente(nomeUtente, faixaEtaria);
			
			utente.add(utent);
		
			
			System.out.println("Utente Registado com sucesso");
			System.out.println();
			System.out.println("Quer introduzir mais algum utente (s/n) ?");
			char response2 = sc.next().charAt(0);

			while (response2 == 's') {
				
				System.out.println();
				System.out.println("Nome do Utente: ");
				nomeUtente = sc.next();
				System.out.println("Faixa Etária do Utente: ");
				faixaEtaria = sc.next();
				System.out.println();
				
				
				for (int l = 0; l < utente.size(); l++) {	
					if (nome != utent.getNome())
						System.out.println("Utente existente.");	
					}
				
				
				System.out.println();
				System.out.println("Quer introduzir mais algum utente (s/n) ?");
				response2 = sc.next().charAt(0);
				
			}
			
			for (int i = 0; i < utente.size(); i++) {
				System.out.print(utente.get(i).getNome());
				System.out.print(" ");
				System.out.println(utente.get(i).getFaixaEtaria());
			}
					
			sc.close();
			
	}
}*/