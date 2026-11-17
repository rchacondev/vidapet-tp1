import java.util.Scanner;

public class ProjetoBlocoTP1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int totalContador = 0;
		String nomeAnimal = "";
		String especieAnimal = "";
		int idadeAnimal = 0;
		String tutorAnimal = "";
		String telefoneTutor = "";
		boolean horarioDisponivel;
		boolean diaDisponivel;
		int diaSemanaAgenda = 0;
		int horaAgenda = 0;
		int minutoAgenda = 0;
		
		int opcaoLoop;
  
		do {
            System.out.println("\n--- MENU VIDA PET ---");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Verificar se um horário pode ser agendado");
            System.out.println("3 - Agendar consulta");
            System.out.println("4 - Resumo");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcaoLoop = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcaoLoop) {
				case 1:
					System.out.print("Nome do animal: ");
					nomeAnimal = scanner.nextLine();

					System.out.print("Espécie do animal: ");
					especieAnimal = scanner.nextLine();

					System.out.print("Idade do animal: ");
					idadeAnimal = scanner.nextInt();
					scanner.nextLine();

					System.out.print("Nome do tutor do animal: ");
					tutorAnimal = scanner.nextLine();

					System.out.print("Telefone do tutor do animal: ");
					telefoneTutor = scanner.nextLine();

					totalContador ++;
					System.out.println("Animal cadastrado: " + nomeAnimal);
					break;
				case 2:
					System.out.println("--- Verificar horário ---");
					System.out.print("Insira o dia da semana: \n1=Seg\n2=Ter\n3=Qua\n4=Qui\n5=Sex\n6=Sáb\n7=Dom");
					diaSemanaAgenda = scanner.nextInt();
					System.out.print("Insira a hora que deseja marcar: ");
					horaAgenda = scanner.nextInt();
					System.out.print("Insira o minuto que deseja marcar: ");
					minutoAgenda = scanner.nextInt();
					scanner.nextLine();
					
					diaDisponivel = (diaSemanaAgenda >= 1 && diaSemanaAgenda <= 5);
					horarioDisponivel = (horaAgenda >= 8 && horaAgenda <= 17) && (minutoAgenda == 0 || minutoAgenda == 30);
					
					if (diaDisponivel && horarioDisponivel) {
						System.out.println("Agenda disponível!");
					} else {
						System.out.println("Agenda indisponível");
					}
		
					break;
				case 3:
					System.out.println("Funcionalidade prevista para a próxima versão.");
					// Será feito posteriormente, pois trata-se de manipulações de lista/coleções.
					break;			
				case 4: 
					System.out.println("total " + totalContador + " | Último animal: " + nomeAnimal);
			
					break;
				case 5: 
					System.out.println("Encerrando sistema...");
					break;
				default:
	                System.out.println("Opção inválida! Tente novamente.");
					break;
			}
		} while (opcaoLoop != 5);
		
		scanner.close();
	}
}