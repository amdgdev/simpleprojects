package empresa;

import java.util.Locale;
import java.util.Scanner;

public class AulaPratica1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner IMC = new Scanner (System.in);
		double peso;
		double altura;
		double cal;
		String veredito = "";
		System.out.println("Digite o seu peso e altura: ");
		peso = IMC.nextDouble();
		altura = IMC.nextDouble();
		cal = peso/( Math.pow(altura, 2));
		if (cal < 19.1) {
			veredito = "Abaixo do peso";
		}
		else if(cal >=19.1 && cal <= 25.8){
			veredito = "Peso normal";
		}else if(cal >= 25.9 && cal <= 27.3) {
			veredito = "Pouco acima do peso";
		}else if (cal >= 27.4 && cal <= 32.3) {
			veredito = "Acima do peso";
		}else if(cal >= 32.4){
			veredito = "Obesidade";
		}
		System.out.printf("Seu peso é: %.2f%n", peso);
		System.out.printf("Seu peso é: %.2f%n", altura);
		System.out.printf("Seu IMC é: %.2f classificado como: %s", cal, veredito);
		
		IMC.close();
		
	}

}
