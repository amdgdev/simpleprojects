import java.util.Locale;
import java.util.Scanner;

public class Exercicio8IfElse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;		
		double d;
		double e;
		double f;
		System.out.println("Digite seu salário: ");
		a = sc.nextDouble();
		if(a <= 2000) {
			System.out.println("Isento");
		}
		else if(a >= 2001 && a <= 3000) {
			System.out.printf("%.2f%n", ( ((a - 2000) / 1000) * 1000)*0.08);
}
		else if(a >= 3001 && a <= 4500) {
					b = ((a - 2000) / 1000);
					c = (int)b;
					d = (c * 1000) * 0.08;
					e = (a - 3000) * 0.18;
					System.out.printf("%.2f%n", d+e)
					
;
		}
		else if( a > 4500) {
			b = ((a - 2000) / 1000);
			c = (int)b;
			d = (c * 1000) * 0.08;
			e = (a - 3000) * 0.18;
			f = (a - 4500) * 0.28;
			System.out.printf("%.2f%n", d+e+f);
			
		}	

			
		
	
	}
}
