package servicos;

import java.util.ArrayList;

import classes.EventoOnline;
import classes.Local;
import classes.Participante;
import repositorios.repEventoOnline;


public class sEventoOnline {
	private repEventoOnline repOn = new repEventoOnline();
	
	public void adicionarEvntOn(String nome, String organizador, String tipo, int dia, int mes, 
		int ano, Local local, int horaInc, int horaFim, int participantesMax, String estaAberto, 
		String platf, String chatAoVivo) {
		EventoOnline evntOn = null;
		evntOn = new EventoOnline(nome, organizador, tipo, dia, mes, ano, local, horaInc, horaFim
				, participantesMax, estaAberto, platf, chatAoVivo);
		if (evntOn != null) {
            repOn.adicionarEvntOn(evntOn);
            System.out.println("Evento adicionada com sucesso!");
        }
	}
	
	public void removerEvntOn(int index) {
		if (index >= 0) {
			int idx = index;
			repOn.removerEvntOn(idx);
		}
	}
	
	public void listarEvntOn() {
	    ArrayList<EventoOnline> EventosO = repOn.listarEvntOn();
	    if (EventosO.isEmpty()) {
	        System.out.println("Nenhum evento cadastrado.");
	        
	    }else {
	       for (int i = 0; i < EventosO.size(); i++) {
	    	   System.out.println(i+1);
	    	   EventoOnline e = EventosO.get(i);
	    	   System.out.println("Nome: "+e.getNomeEvnt()+" Tipo do evento: "+e.getTipo());
	    	   System.out.println("Organizador: "+e.getOrganizador());
	    	   System.out.println("Plataforma: "+e.getPlataforma());
	    	   System.out.println("Disponibilidade de Chat Ao Vivo: "+e.getChatAoVivo());
	    	   System.out.println("Data: "+e.getDia()+"/"+e.getMes()+"/"+e.getAno());
	    	   System.out.println("Hora de Início: "+e.getHoraInc()+" Finalização prevista: "+e.getHoraFim());
	    	   System.out.println("Quantidade máxima de participantes: "+e.getQtdParticipantesMax());
	    	   System.out.println("Disponibilidade: "+e.getEstaAberto());
	       }
	   }
	}
	public void editarEvntOn(int index, String nome, String organizador, String tipo, int dia, int mes, 
			int ano, Local local, int horaInc, int horaFim, int participantesMax, String estaAberto, 
			String platf, String chatAoVivo) {
		EventoOnline evntOn = null;
		evntOn = new EventoOnline(nome, organizador, tipo, dia, mes, ano, local, horaInc, horaFim
				, participantesMax, estaAberto, platf, chatAoVivo);
		int idx = index;
		if (evntOn != null) {
			repOn.alterarEvntOn(idx, evntOn);
			System.out.println("evento alterado com sucesso!");
        }
	}
	public void buscarEvntOn(int index) {
		EventoOnline evento = repOn.buscarEvntOn(index);
	    
	    // Verifica se o evento foi encontrado
	    if (evento != null) {
	        // Imprime o evento
	        System.out.println("Evento encontrado:");
	        System.out.println("Nome: "+evento.getNomeEvnt()+" Tipo do evento: "+evento.getTipo());
	    	   System.out.println("Organizador: "+evento.getOrganizador());
	    	   System.out.println("Plataforma: "+evento.getPlataforma());
	    	   System.out.println("Disponibilidade de Chat Ao Vivo: "+evento.getChatAoVivo());
	    	   System.out.println("Data: "+evento.getDia()+"/"+evento.getMes()+"/"+evento.getAno());
	    	   System.out.println("Hora de Início: "+evento.getHoraInc()+" Finalização prevista: "+evento.getHoraFim());
	    	   System.out.println("Quantidade máxima de participantes: "+evento.getQtdParticipantesMax());
	    	   System.out.println("Disponibilidade: "+evento.getEstaAberto());
	    } else {
	        System.out.println("Nenhum evento encontrado no índice fornecido.");
	    }
	}
}
