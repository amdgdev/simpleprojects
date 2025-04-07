import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultado;
		System.out.println("Digite o primeiro número: ");
		int number1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int number2 = sc.nextInt();
		System.out.println("Escolha uma operação ( +, -, *, / )");
		sc.nextLine();
		String operation = sc.nextLine();
		switch(operation) {
		case "+":
			resultado = number1 + number2;
			System.out.printf("Resultado: %d %s %d = %d", number1, operation, number2, resultado);
			break;
		case "-":
			resultado = number1 - number2;
			System.out.printf("Resultado: %d %s %d = %d", number1, operation, number2, resultado);
			break;
		case "*":
			resultado = number1 * number2;
			System.out.printf("Resultado: %d %s %d = %d", number1, operation, number2, resultado);
			break;
		case "/":
			resultado = number1 / number2;
			System.out.printf("Resultado: %d %s %d = %d", number1, operation, number2, resultado);
			break;
		default:
			System.out.println("Inválido!Tente novamente!");
			break;
		}
		sc.close();
		}
	}


