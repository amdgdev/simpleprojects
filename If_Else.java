import java.util.Locale;
import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			// Exercício 4
			double j, k,l, m, total;
			j =	sc.nextDouble();
			k =	sc.nextDouble();
			System.out.println("Digite o código dos produtos: ");
			if(j == 1) {
				j = 4.00;
			}else if(j == 2) {
				j = 4.50;
			}else if(j == 3) {
				j = 5.00;
			}else if(j == 4) {
				j = 2.00;
			}else if(j == 5){
				j = 1.50;
			}else {
				System.out.println("Código INVÁLIDO!");
			}
			if(k == 1) {
				k = 4.00;
			}else if ( k == 2){
				k = 4.50;
			}else if(k == 3){
				k = 5.00;
			}else if(k == 4){
				k = 2.00;
			}else if(k == 5) {
				k = 1.50;
			}else {
				System.out.println("Código INVÁLIDO!");
			}
			if( j < 5.01 && k < 5.02) {
			System.out.printf("TOTAL: %.2f%n", j+k);
		}else {
			System.out.println("ERRO!");
		}
	}
}
