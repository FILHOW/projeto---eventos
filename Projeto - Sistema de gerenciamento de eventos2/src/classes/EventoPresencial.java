package classes;

import java.util.Scanner;

import servicos.sEventoPresencial;

public class EventoPresencial extends Evento {		
	private String estacionamento;
	private String climaEsperado;
	
	Scanner input = new Scanner(System.in);
	
	sEventoPresencial sEventoOnline = new sEventoPresencial();

	public EventoPresencial(String nE, String org, String tip, int d, int m, int a, Local l,
			int hIn, int hFm, int pMax, String estaAberto, String est, String cEsp) {
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
				this.setEstacionamento(est);
				this.setClimaEsperado(cEsp);
			}
	
	public String getEstacionamento() {
		return estacionamento;
	}
	public void setEstacionamento(String est) {
		this.estacionamento = est;
	}

	public String getClimaEsperado() {
		return climaEsperado;
	}
	public void setClimaEsperado(String climaEsperado) {
		this.climaEsperado = climaEsperado;
	}
}
