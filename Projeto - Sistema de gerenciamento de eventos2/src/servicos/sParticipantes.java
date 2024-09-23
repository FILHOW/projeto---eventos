package servicos;

import java.util.ArrayList;

import classes.EventoOnline;
import classes.Main;
import classes.Participante;
import repositorios.repParticipantes;


public class sParticipantes {
	private repParticipantes participante = new repParticipantes();
	
	public void existeConta( String email, String senha) {
		boolean contaEncontrada = false;
		Participante part = new Participante(email, senha);
		for (int i = 0; i < participante.quantContas() ; i++ ) {
			if (participante.pegarConta(i).equals(part)){
				System.out.println("Acesso concedido.");
				contaEncontrada = true;
				break;
			}		
		}
		if (contaEncontrada == false) {
			System.out.println("Acesso negado");
			part.contaExiste();
		}
	}
	
	public void adicionarConta(String email, String senha) {
		Participante part = null;
		part = new Participante(email, senha);
		if (part != null) {
			participante.adicionarConta(part);
			System.out.println("Conta adicionada com sucesso!");
        }
	}
	public void removerConta(int index) {
		if (index >= 0) {
			int idx = index;
			participante.removerConta(idx);
		}
	}
	
	public void listarContas() {
	    ArrayList<Participante> participantes = participante.listarContas();
	    if (participantes.isEmpty()) {
	        System.out.println("Nenhuma conta cadastrada.");
	    }else {
	       for (int i = 0; i < participantes.size(); i++) {
	    	   System.out.println(i+1);
	    	   Participante e = participantes.get(i);
	    	   System.out.println("Email: "+e.getEmail());
	    	   System.out.println("Senha: "+e.getSenha());
	       }
	   }
	}
	public void editarConta(int index, String email, String senha) {
		Participante part = null;
		int idx = index;
		part = new Participante(email, senha);
		if (part != null) {
			participante.alterarConta(idx, part);
			System.out.println("Conta alterada com sucesso!");
        }
	}
	public void buscarConta(int index) {
		Participante Part = participante.buscarConta(index);
	    
	    // Verifica se o evento foi encontrado
	    if (Part != null) {
	        // Imprime o evento
	        System.out.println("Conta Encontrada:");
	        System.out.println("Email: "+Part.getEmail());
	    	System.out.println("Senha: "+Part.getSenha());
	        
	    } else {
	        System.out.println("Nenhuma conta encontrado no índice fornecido.");
	    }
	}
}
