import java.util.Locale;
import java.util.Scanner;

public class Exercicio7IfElse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a,b;
		System.out.println("Digite os números: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		if(a >= 1 && b >= 1) {
			System.out.println("Q1");
		}
		else if(a <= -1 && b >= 1) {
			System.out.println("Q2");
		}
		else if(a <= -1 && b <= -1) {
			System.out.println("Q3");
		}
		else if(a >= 1 && b <= -1) {
		System.out.println("Q4");
		}
		else if(a == 0 & b == 0) {
			System.out.println("Origem");
		}
	}

}
