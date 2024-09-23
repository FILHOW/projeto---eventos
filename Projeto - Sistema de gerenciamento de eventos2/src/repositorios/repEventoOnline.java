package repositorios;

import java.util.ArrayList;
import classes.EventoOnline;
import classes.Participante;

public class repEventoOnline {
	EventoOnline eo;
	
	private ArrayList<EventoOnline> EventosO = new ArrayList<EventoOnline>();
	
	public void adicionarEvntOn(EventoOnline evntOn) {
		EventosO.add(evntOn);
	}
	
	public ArrayList<EventoOnline> listarEvntOn() {
		return EventosO;
	}
	
	public EventoOnline buscarEvntOn(int index) {
		if (index >= 0 && index < EventosO.size()) {
            return EventosO.get(index);
        }else {
        	System.out.println("Evento não encontrado.");
        	return null;
        }	
    }
	public void removerEvntOn(int index) {
		if (index >= 0 && index < EventosO.size()) {
			eo = EventosO.get(index);
			EventosO.remove(index);
			System.out.println("O item foi removido.");
		}else {
		}
	}
	public void alterarEvntOn(int index, EventoOnline evntOn) {
		if (index >= 0 && index < EventosO.size()) {
			EventosO.remove(index);
			EventosO.add(index, evntOn);
			System.out.println("alteração concluida");
		}else {	
			System.out.println("Evento não Encontrado");
		}
	}
}