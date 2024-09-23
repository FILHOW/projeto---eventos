package classes;

import java.util.Scanner;

import repositorios.repEventoOnline;
import servicos.sEventoOnline;

public class EventoOnline extends Evento {
	private String Plataforma;
	private String chatAoVivo;
	
	public static Scanner input = new Scanner(System.in);
	
	sEventoOnline sEventoOnline = new sEventoOnline();
	repEventoOnline repEventoOnline = new repEventoOnline();
	
	public EventoOnline(String nE, String org, String tip, int d, int m, int a, Local l,
			int hIn, int hFm, int pMax, String estaAberto, String Plat, String chatAoVivo2) {
				this.setNomeEvnt(nE);
				this.setOrganizador(org);
				this.setTipo(tip);
				this.setDia(d);
				this.setMes(m);
				this.setAno(a);
				this.setLocal(l);
				this.setHoraInc(hIn);
				this.setHoraFim(hFm);
				this.setQtdParticipantesMax(pMax);
				this.setEstaAberto(estaAberto);
				this.setPlataforma(Plat);
				this.setChatAoVivo(chatAoVivo2);
			}
	
	public String getPlataforma() {
		return Plataforma;
	}
	public void setPlataforma(String plataforma) {
		Plataforma = plataforma;
	}
	
	public String getChatAoVivo() {
		return chatAoVivo;
	}
	public void setChatAoVivo(String chatAoVivo) {
		this.chatAoVivo = chatAoVivo;
	}
}
	
	
