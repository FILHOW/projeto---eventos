package classes;

import java.util.Scanner;

import repositorios.repParticipantes;
import servicos.sEventoPresencial;
import servicos.sEventoOnline;
import servicos.sParticipantes;

public class Main {
	public static sEventoPresencial sEventoPresencial = new sEventoPresencial();
	public static sEventoOnline sEventoOnline = new sEventoOnline();
	public static sParticipantes sParticipantes = new sParticipantes();
	private static int codigo = 43806;

	public static void main(String[] args) {
		Participante P = new Participante(null, null);
		EventoOnline eo = new EventoOnline(null, null, null, 0, 0, 0, null, 0, 0, 0, null, null, null);
		Scanner input = new Scanner(System.in);
		Scanner inputAdm = new Scanner(System.in);
		Scanner inputAdm2 = new Scanner(System.in);
		Scanner inputAdm3 = new Scanner(System.in);
		int escolha;
		
		while (true) {
			System.out.println("|---GERENCIADOR DE EVENTOS---|");
			System.out.println("Selecione uma das opções abaixo:");
			System.out.println("[1] Fazer Login.");//metodo para verificar senha e outro para verificar email
			System.out.println("[2] cadastrar-se.");
			System.out.println("[3] Sair.");
			escolha = input.nextInt();
			if (escolha == 1) {
				P.contaExiste();
				while (true) {
				System.out.println("|---EVENTOS DISPONIVEIS---|");
				System.out.println("[1] Eventos Presenciais.");
				System.out.println("[2] Eventos Online.");
				System.out.println("[3] voltar.");
				escolha = input.nextInt();
				if (escolha == 1) {
					while (true) {	
						System.out.println("Lista de Eventos presenciais: ");
						sEventoPresencial.listarEvntPr();
						System.out.println("Digite 0 para voltar.");
						escolha = input.nextInt();
						if (escolha == 0) {
							System.out.println("Saindo.");
							break;
						}else {
							System.out.println("ERRO, digite uma das opções dadas");
						}
					}
				}else if (escolha == 2) {
					while (true) {	
						System.out.println("Lista de Eventos Online: ");
						sEventoOnline.listarEvntOn();
						System.out.println("Digite 0 para voltar.");
						escolha = input.nextInt();
						if (escolha == 0) {
							System.out.println("Saindo.");
							break;
						}else {
							System.out.println("ERRO, digite uma das opções dadas");
						}
					}
				}else if (escolha == 3) {
					System.out.println("Saindo.");
					break;
				}else {
					System.out.println("ERRO, digite uma das opções dadas");
				}
				
				//System.out.println("|---LISTA DE EVENTOS---|");
				//printar a lista de eventos disponiveis respectivo ao tipo de evento escolhido pelo usuario
				}
				break;
			}else if(escolha == 2) {
				P.addConta();

			} else if(escolha == 3) {
				System.out.println("Saindo");
				break;
			}else if(escolha == codigo){
				while(true) {
					System.out.println("PAINEL DE ADIMINISTRAÇÃO");
					System.out.println("[1] gerenciar Eventos Presenciais.");
					System.out.println("[2] gerenciar Eventos Online.");
					System.out.println("[3] gerenciar contas.");
					System.out.println("[4] Sair.");
					escolha = inputAdm.nextInt();
					if (escolha == 1) {
						while(true) {
							System.out.println("[1] Remover Evento.");
							System.out.println("[2] Adicionar Evento.");
							System.out.println("[3] Editar Evento.");
							System.out.println("[4] Buscar Evento.");
							System.out.println("[5] Sair.");
							escolha = inputAdm2.nextInt();
							if (escolha == 1) {
								Scanner input2 = new Scanner(System.in);
								int e1;
								sEventoPresencial.listarEvntPr();
								System.out.println("Digite o indice do Evento que deseja remover(caso queira retornar digite 0): ");
								while(true) {
									e1 = input2.nextInt();
									if (e1 > 0) {
										sEventoPresencial.removerEvntPr(e1 - 1);
										break;
									}else if(e1 == 0){
										System.out.println("OK");
										break;
									}
								}
							}else if (escolha == 2) {
								String nome, organizador, tipo, est;
								String cidade, estado, rua;
								int dia, mes, ano, horaInc, horaFim, participantesMax;
								String estaAberto = null, cEsp;
								System.out.println("Digite o nome do evento: ");
								nome = input.next();
								System.out.println("Digite o nome do organizador do evento: ");
								organizador = input.next();
								System.out.println("Digite o tipo do evento: ");
								tipo = input.next();
								System.out.println("Tem estacionamento? ");
								est = input.next();
								System.out.println("Digite o nome da cidade em que ocorrera o evento: ");
								cidade = input.next();
								System.out.println("Digite o nome do estado em que ocorrera o evento: ");
								estado = input.next();
								System.out.println("Digite o nome da rua em que ocorrera o evento: ");
								rua = input.next();
								System.out.println("Digite o dia do evento: ");
								dia = input.nextInt();
								System.out.println("Digite o mês do evento: ");
								mes = input.nextInt();
								System.out.println("Digite o ano do evento: ");
								ano = input.nextInt();
								System.out.println("Digite o horario de inicio do Evento: ");
								horaInc = input.nextInt();
								System.out.println("Digite o horario do fim do Evento: ");
								horaFim = input.nextInt();
								System.out.println("Digite a capacidade máxima de participantes do Evento: ");
								participantesMax = input.nextInt();
								System.out.println("Clima esperado: ");
								cEsp = input.next();
								Local local = new Local(cidade, estado, rua);
								sEventoPresencial.adicionarEvntPr(nome, organizador, tipo, dia, mes, ano, local, horaInc, horaFim
										, participantesMax, estaAberto, est, cEsp);
							}else if (escolha == 3) {
								int e3;
								sEventoPresencial.listarEvntPr();
								System.out.println("Digite o indice do Evento que deseja alterar: ");
								e3 = input.nextInt();
								String nome, organizador, tipo, est;
								String cidade, estado, rua;
								int dia, mes, ano, horaInc, horaFim, participantesMax;
								String estaAberto = null, cEsp;
								System.out.println("Digite o nome do evento: ");
								nome = input.next();
								System.out.println("Digite o nome do organizador do evento: ");
								organizador = input.next();
								System.out.println("Digite o tipo do evento: ");
								tipo = input.next();
								System.out.println("Tem estacionamento? ");
								est = input.next();
								System.out.println("Digite o nome da cidade em que ocorrera o evento: ");
								cidade = input.next();
								System.out.println("Digite o nome do estado em que ocorrera o evento: ");
								estado = input.next();
								System.out.println("Digite o nome da rua em que ocorrera o evento: ");
								rua = input.next();
								System.out.println("Digite o dia do evento: ");
								dia = input.nextInt();
								System.out.println("Digite o mês do evento: ");
								mes = input.nextInt();
								System.out.println("Digite o ano do evento: ");
								ano = input.nextInt();
								System.out.println("Digite o horario de inicio do Evento: ");
								horaInc = input.nextInt();
								System.out.println("Digite o horario do fim do Evento: ");
								horaFim = input.nextInt();
								System.out.println("Digite a capacidade máxima de participantes do Evento: ");
								participantesMax = input.nextInt();
								System.out.println("Clima esperado: ");
								cEsp = input.next();
								Local local = new Local(cidade, estado, rua);
								sEventoPresencial.editarEvntPr(e3 - 1, nome, organizador, tipo, dia, mes, ano, local, horaInc, horaFim
										, participantesMax, estaAberto, est, cEsp);
							}else if (escolha == 4) {
								int e4;
								System.out.println("Digite o índice do valor que você quer buscar: ");
								e4 = input.nextInt();
								sEventoPresencial.buscarEvntPr(e4-1);
							}else if (escolha == 5){
								break;
							}else {
								System.out.println("ERRO, digite uma das opções dadas.");
							}
						}
					}else if (escolha == 2) {
						while(true) {
							System.out.println("[1] Remover Evento.");
							System.out.println("[2] Adicionar Evento.");
							System.out.println("[3] Editar Evento.");
							System.out.println("[4] Buscar Evento.");
							System.out.println("[5] Sair.");
							escolha = inputAdm3.nextInt();
							if (escolha == 1) {
								Scanner input2 = new Scanner(System.in);
								int e1;
								sEventoOnline.listarEvntOn();
								System.out.println("Digite o indice do Evento que deseja remover(caso queira retornar digite 0): ");
								while(true) {
									e1 = input2.nextInt();
									if (e1 > 0) {
										sEventoOnline.removerEvntOn(e1 - 1);
										break;
									}else if(e1 == 0){
										System.out.println("OK");
										break;
									}
								}
							}else if (escolha == 2) {
								String nome, organizador, tipo, platf;
								String cidade, estado, rua;
								int dia, mes, ano, horaInc, horaFim, participantesMax;
								String estaAberto = null, chatAoVivo;
								System.out.println("Digite o nome do evento: ");
								nome = input.next();
								System.out.println("Digite o nome do organizador do evento: ");
								organizador = input.next();
								System.out.println("Digite o tipo do evento: ");
								tipo = input.next();
								System.out.println("Digite a plataforma em que ocorrera o evento: ");
								platf = input.next();
								System.out.println("Digite o nome da cidade em que ocorrera o evento: ");
								cidade = input.next();
								System.out.println("Digite o nome do estado em que ocorrera o evento: ");
								estado = input.next();
								System.out.println("Digite o nome da rua em que ocorrera o evento: ");
								rua = input.next();
								System.out.println("Digite o dia do evento: ");
								dia = input.nextInt();
								System.out.println("Digite o mês do evento: ");
								mes = input.nextInt();
								System.out.println("Digite o ano do evento: ");
								ano = input.nextInt();
								System.out.println("Digite o horario de inicio do Evento: ");
								horaInc = input.nextInt();
								System.out.println("Digite o horario do fim do Evento: ");
								horaFim = input.nextInt();
								System.out.println("Digite a capacidade máxima de participantes do Evento: ");
								participantesMax = input.nextInt();
								System.out.println("Evento tera chat ao vivo? ");
								chatAoVivo = input.next();
								Local local = new Local(cidade, estado, rua);
								sEventoOnline.adicionarEvntOn(nome, organizador, tipo, dia, mes, ano, local, horaInc, horaFim
										, participantesMax, estaAberto, platf, chatAoVivo);
							}else if (escolha == 3) {
								int e3;
								sEventoOnline.listarEvntOn();
								System.out.println("Digite o indice do Evento que deseja alterar: ");
								e3 = input.nextInt();
								String nome, organizador, tipo, platf;
								String cidade, estado, rua;
								int dia, mes, ano, horaInc, horaFim, participantesMax;
								String estaAberto = null, chatAoVivo;
								System.out.println("Digite o nome do evento: ");
								nome = input.next();
								System.out.println("Digite o nome do organizador do evento: ");
								organizador = input.next();
								System.out.println("Digite o tipo do evento: ");
								tipo = input.next();
								System.out.println("Digite a plataforma em que ocorrera o evento: ");
								platf = input.next();
								System.out.println("Digite o nome da cidade em que ocorrera o evento: ");
								cidade = input.next();
								System.out.println("Digite o nome do estado em que ocorrera o evento: ");
								estado = input.next();
								System.out.println("Digite o nome da rua em que ocorrera o evento: ");
								rua = input.next();
								System.out.println("Digite o dia do evento: ");
								dia = input.nextInt();
								System.out.println("Digite o mês do evento: ");
								mes = input.nextInt();
								System.out.println("Digite o ano do evento: ");
								ano = input.nextInt();
								System.out.println("Digite o horario de inicio do Evento: ");
								horaInc = input.nextInt();
								System.out.println("Digite o horario do fim do Evento: ");
								horaFim = input.nextInt();
								System.out.println("Digite a capacidade máxima de participantes do Evento: ");
								participantesMax = input.nextInt();
								System.out.println("Evento tera chat ao vivo? ");
								chatAoVivo = input.next();
								Local local = new Local(cidade, estado, rua);
								sEventoOnline.editarEvntOn(e3 - 1, nome, organizador, tipo, dia, mes, ano, local, horaInc, horaFim
										, participantesMax, estaAberto, platf, chatAoVivo);
							}else if (escolha == 4) {
								int e4;
								System.out.println("Digite o índice do valor que você quer buscar: ");
								e4 = input.nextInt();
								sEventoOnline.buscarEvntOn(e4-1);
							}else if (escolha == 5){
								break;
							}else {
								System.out.println("ERRO, digite uma das opções dadas.");
							}
						}
					}else if (escolha == 3) {
						while(true) {
							System.out.println("[1] Remover conta.");
							System.out.println("[2] Adicionar conta.");
							System.out.println("[3] Editar conta.");
							System.out.println("[4] Buscar conta.");
							System.out.println("[5] Sair.");
							escolha = inputAdm3.nextInt();
							if (escolha == 1) {
								Scanner input2 = new Scanner(System.in);
								int e1;
								sParticipantes.listarContas();
								System.out.println("Digite o indice da conta que deseja remover(caso queira retornar digite 0): ");
								while(true) {
									e1 = input2.nextInt();
									if (e1 > 0) {
										sParticipantes.removerConta(e1 - 1);
										break;
									}else if(e1 == 0){
										System.out.println("OK");
										break;
									}
								}
							}else if (escolha == 2) {
								String email, senha;
								System.out.println("Digite o email: ");
								email = input.next();
								System.out.println("Digite a senha: ");
								senha = input.next();
								sParticipantes.adicionarConta(email, senha);
							}else if (escolha == 3) {
								int e3;
								sParticipantes.listarContas();
								System.out.println("Digite o indice do Evento que deseja alterar: ");
								e3 = input.nextInt();
								String email, senha;
								System.out.println("Digite o Email: ");
								email = input.next();
								System.out.println("Digite a senha: ");
								senha = input.next();
								sParticipantes.editarConta(e3 - 1, email, senha);
							}
							else if (escolha == 4) {
								int e4;
								System.out.println("Digite o índice do valor que você quer buscar: ");
								e4 = input.nextInt();
								sParticipantes.buscarConta(e4-1);
							}else if (escolha == 5){
								break;
							}else {
								System.out.println("ERRO, digite uma das opções dadas.");
							}
						}
					}else if (escolha == 4) {
						System.out.println("Saindo.");
						break;
					}else {
						System.out.println("ERRO, digite uma das opções dadas.");
					}
				}
			}else {
				System.out.println("ERRO, digite um dos valores solicitados.");
			}
		}
		input.close();
		inputAdm.close();
		inputAdm2.close();
		inputAdm3.close();
	}
}
