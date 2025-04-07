import java.util.Scanner;

public class ExConTemeraria2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os números: ");
		int number = sc.nextInt();
		int number2 = sc.nextInt();
		String analise = (number > number2) ? 	
		"O maior número entre	"+ number + "	e	" + number2 + "	é	" + number	
		:
		"O maior número entre	"+ number + "	e	" + number2 + 	"é	" + number2 ;
		System.out.println(analise);
	}

}
