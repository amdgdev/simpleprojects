import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Entradas:  numerofuncionario ,horaptrab, salario
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int NUMBER , HOURSJOB;
		Double HOURPERJOB ,  SALARY;
		NUMBER = sc.nextInt();
		HOURSJOB = sc.nextInt();
		HOURPERJOB = sc.nextDouble();
		SALARY  = HOURPERJOB*HOURSJOB;
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$  %.2f%n" , SALARY);
		sc.close();

	}

}
