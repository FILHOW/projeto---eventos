package classes;

import java.util.Objects;

import java.util.Scanner;

import repositorios.repParticipantes;
import servicos.sEventoOnline;
import servicos.sEventoPresencial;
import servicos.sParticipantes;

public class Participante {
	private String email;
	private String senha;
	
	repParticipantes repParticipantes = new repParticipantes();
	sParticipantes sParticipantes = new sParticipantes();
	
	Scanner input = new Scanner(System.in);
	String ema;
	String sen;
	EventoOnline eo = new EventoOnline(null, null, null, 0, 0, 0, null, 0, 0, 0, 
			null, null, null);
	
	public Participante(String em, String s) {
		this.setEmail(em);
		this.setSenha(s);
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(email, that.email) &&
               Objects.equals(senha, that.senha);
    }

    public int hashCode() {
        return Objects.hash(email, senha);
    }

	public void contaExiste() {
		int escolha = 0;
		while (true) {
			System.out.println("Digite 1 se quiser continuar(ou tentar novamente)"
					+ " e 0 caso ainda não tenha uma conta e queira criar uma.");
			escolha = input.nextInt();
			if (escolha == 1) {
				break;
			}else if (escolha == 0){
				addConta();
				break;
			}else {
				System.out.println("ERRO, digite uma das opções dadas.");
			}
		}
		System.out.println("Digite seu email: ");
		ema = input.next();
		System.out.println("Digite sua senha: ");
		sen = input.next();
		sParticipantes.existeConta(ema, sen);
	}
	
	public void addConta() {
		String em;
		String s;
		System.out.println("Digite um email: ");
		while (true) {
			em = input.next();
			if (!em.contains("@") && !em.contains(".com")) {
				System.out.println("ERRO, digite um email valido.");
			}else {
				break;
			}
		}System.out.println("Digite uma senha(máximo de 5 digitos): ");
		while (true) {
			s = input.next();
			if (s.contains(" ") || s.length()>5) {
				System.out.println("ERRO, digite uma senha valida.");
			}else {
				break;
			}
		}
		sParticipantes.adicionarConta(em, s);
	}
}
