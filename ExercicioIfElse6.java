import java.util.Locale;
import java.util.Scanner;

public class ExercicioIfElse6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);
		double a;
		System.out.println("Digite um número: ");
		a = sc.nextDouble();
		if(a >= 0 && a <= 25) {
			System.out.println("Intervalo [0, 25]");
		}
		else if(a >= 25 && a <= 50){
				System.out.println("Intervalo [25, 50]");
		}
		else if(a >= 75 && a <= 100) {
			System.out.println("Intervalo [75, 100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
	}

}
