package repositorios;

import java.util.ArrayList;
import classes.Participante;

public class repParticipantes {
	Participante p;	
	
	private ArrayList<Participante> participantes = new ArrayList<Participante>();
	
	public void adicionarConta(Participante participante) {
		participantes.add(participante);
	}
	
	public int quantContas() {
		return participantes.size();
	}
	
	public Participante pegarConta(int index){
		return participantes.get(index);
	}
	
	public ArrayList<Participante> listarContas() {
		return participantes;
	}
	
	public Participante buscarConta(int index) {
		if (index >= 0 && index < participantes.size()) {
            return participantes.get(index);
        }else {
        	return null;
        }	
    }
	public void removerConta(int index) {
		if (index >= 0 && index < participantes.size()) {
			p = participantes.get(index);
			participantes.remove(index);
			System.out.println("Item remvido.");
		}
	}
	public String alterarConta(int index, Participante participante) {
		if (index >= 0 && index < participantes.size()) {
			participantes.remove(index);
			participantes.add(index, participante);
			return "alteração concluida";
		}else {
			return null;
		}
	}
}

