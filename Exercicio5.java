import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int peca1 ,   numPeca1 , peca2 , numPeca2;
		double  valPeca1 , valPeca2 , TOTAL;
		peca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valPeca1 = sc.nextDouble();
		peca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valPeca2 = sc.nextDouble();
		TOTAL = numPeca1*valPeca1+numPeca2*valPeca2;
		System.out.printf("VALOR A PAGAR:R$ %.2f%n", TOTAL);
		sc.close();
	}

}
