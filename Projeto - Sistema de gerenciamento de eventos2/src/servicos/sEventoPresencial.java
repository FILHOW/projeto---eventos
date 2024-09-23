package servicos;

import java.util.ArrayList;

import classes.EventoOnline;
import classes.EventoPresencial;
import classes.Local;
import repositorios.repEventoPresencial;


public class sEventoPresencial {
	private repEventoPresencial repPr = new repEventoPresencial();
	
	public void adicionarEvntPr(String nome, String organizador, String tipo, int dia, int mes, 
		int ano, Local local, int horaInc, int horaFim, int participantesMax, String estaAberto, 
		String estacionamento, String climaEsperado) {
		EventoPresencial evntPr = null;
		evntPr = new EventoPresencial(nome, organizador, tipo, dia, mes, ano, local, horaInc, horaFim
				, participantesMax, estaAberto, estacionamento, climaEsperado);
		if (evntPr != null) {
			repPr.adicionarEvntPr(evntPr);
            System.out.println("Evento adicionada com sucesso!");
        }
	}
	public void listarEvntPr() {
	    ArrayList<EventoPresencial> EventosP = repPr.listarEvntOn();
	    if (EventosP.isEmpty()) {
	        System.out.println("Nenhum evento cadastrada.");
	    }else {
	       for (int i = 0; i < EventosP.size(); i++) {
	    	   System.out.println(i+1);
	    	   EventoPresencial e = EventosP.get(i);
	    	   System.out.println("Nome: "+e.getNomeEvnt()+" Tipo do evento: "+e.getTipo());
	    	   System.out.println("Organizador: "+e.getOrganizador());
	    	   System.out.println("Clima esperado: "+e.getClimaEsperado());
	    	   System.out.println("Disponibilidade de Estacionamento: "+e.getEstacionamento());
	    	   System.out.println("Data: "+e.getDia()+"/"+e.getMes()+"/"+e.getAno());
	    	   System.out.println("Hora de Início: "+e.getHoraInc()+" Finalização prevista: "+e.getHoraFim());
	    	   System.out.println("Quantidade máxima de participantes: "+e.getQtdParticipantesMax());
	    	   System.out.println("Disponibilidade: "+e.getEstaAberto());
	       }
	   }
	}
	public void removerEvntPr(int index) {
		if (index >= 0) {
			int idx = index;
			repPr.removerEvntPr(idx);
		}
	}
	public void editarEvntPr(int index, String nome, String organizador, String tipo, int dia, int mes, 
			int ano, Local local, int horaInc, int horaFim, int participantesMax, String estaAberto, 
			String estacionamento, String climaEsperado) {
		EventoPresencial evntPr = null;
		evntPr = new EventoPresencial(nome, organizador, tipo, dia, mes, ano, local, horaInc, horaFim
				, participantesMax, estaAberto, estacionamento, climaEsperado);
		int idx = index;
		if (evntPr != null) {
			repPr.alterarEvntPr(idx, evntPr);
			System.out.println("evento alterado com sucesso!");
        }
	}
		public void buscarEvntPr(int index) {
			EventoPresencial evento = repPr.buscarEvntPr(index);
		    // Verifica se o evento foi encontrado
		    if (evento != null) {
		        // Imprime o evento
		        System.out.println("Evento encontrado:");
		        System.out.println("Nome: "+evento.getNomeEvnt()+" Tipo do evento: "+evento.getTipo());
		    	   System.out.println("Organizador: "+evento.getOrganizador());
		    	   System.out.println("Estacionamento: "+evento.getEstacionamento());
		    	   System.out.println("Clima Esperado: "+evento.getClimaEsperado());
		    	   System.out.println("Data: "+evento.getDia()+"/"+evento.getMes()+"/"+evento.getAno());
		    	   System.out.println("Hora de Início: "+evento.getHoraInc()+" Finalização prevista: "+evento.getHoraFim());
		    	   System.out.println("Quantidade máxima de participantes: "+evento.getQtdParticipantesMax());
		    	   System.out.println("Disponibilidade: "+evento.getEstaAberto());
		    } else {
		        System.out.println("Nenhum evento encontrado no índice fornecido.");
		    }
		}
}