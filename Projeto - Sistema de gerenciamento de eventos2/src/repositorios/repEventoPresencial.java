package repositorios;

import java.util.ArrayList;

import classes.EventoOnline;
import classes.EventoPresencial;

public class repEventoPresencial {
	EventoPresencial ep;
	
	private ArrayList<EventoPresencial> EventosP = new ArrayList<EventoPresencial>();
	
	public void adicionarEvntPr(EventoPresencial evntPr) {
		EventosP.add(evntPr);
	}
	
	public ArrayList<EventoPresencial> listarEvntOn() {
		return EventosP;
	}
	
	public EventoPresencial buscarEvntPr(int index) {
		if (index >= 0 && index < EventosP.size()) {
            return EventosP.get(index);
        }else {
        	return null;
        }	
    }
	public void removerEvntPr(int index) {
		if (index >= 0 && index < EventosP.size()) {
			ep = EventosP.get(index);
			EventosP.remove(index);
			System.out.println("Item Removido");
		}
	}
	public String alterarEvntPr(int index, EventoPresencial evntPr) {
		if (index >= 0 && index < EventosP.size()) {
			EventosP.remove(index);
			EventosP.add(index, evntPr);
			return "alteração concluida";
		}else {
			return null;
		}
	}
}