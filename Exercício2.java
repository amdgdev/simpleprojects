import java.util.Locale;
import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a , b , area;
		a = sc.nextDouble();
		b = 3.14159;
		area = b*(Math.pow(a,  2));
		
		System.out.printf("A = %.4f%n" , area);
		sc.close();

	}

}
