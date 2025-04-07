import java.util.Scanner;

public class CalculatorFin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String categoria = null;
		double despesa = 0;
		double total;
		System.out.printf("1 - Registrar Despesas%n 2 - Exibir Despesas%n 3 - Exibir Total de Despesas%n 4-Sair%n");
		int entry = sc.nextInt();
		switch(entry){
		case 1:
			System.out.println("Digite a categoria da despesa: ");
			categoria = sc.nextLine();
			sc.nextLine();
			System.out.println("Digite o valor da despesa: ");
			despesa = sc.nextDouble();
			break;
		case 2:
			System.out.printf("Essa foram as despesas: " , categoria);
			break;
		case 3:
			total = despesa;
			System.out.printf("Total de despesas: ", total);
			break;
		case 4:
			System.out.println("Saindo...");
			break;
		}
	}

}
