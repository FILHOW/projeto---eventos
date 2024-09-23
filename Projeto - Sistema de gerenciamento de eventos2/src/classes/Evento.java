package classes;

public class Evento {
	private String nomeEvnt;
	private String organizador;
	private String tipo; /*implementar o enum, alguns exemplos podem ser feiras, shows ao 
	vivo, eventos beneficentes, palestras, corridas, convensões*/
	private int dia;
	private int mes;
	private int ano;
	private Local local;
	private int horaInc;
	private int horaFim;
	private int qtdParticipantesMax;
	private String estaAberto;
	
	public String getNomeEvnt() {
		return nomeEvnt;
	}
	public void setNomeEvnt(String nomeEvnt) {
		this.nomeEvnt = nomeEvnt;
	}
	
	public String getOrganizador() {
		return organizador;
	}
	public void setOrganizador(String organizador) {
		this.organizador = organizador;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	
	public int getHoraInc() {
		return horaInc;
	}
	public void setHoraInc(int horaInc) {
		this.horaInc = horaInc;
	}
	
	public int getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}

	public int getQtdParticipantesMax() {
		return qtdParticipantesMax;
	}
	public void setQtdParticipantesMax(int quantParticipantesMax) {
		this.qtdParticipantesMax = quantParticipantesMax;
	}
	public String getEstaAberto() {
		return estaAberto;
	}
	public void setEstaAberto(String eAb) {
		this.estaAberto = eAb;
	}
}
