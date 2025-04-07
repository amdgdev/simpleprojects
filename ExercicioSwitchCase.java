import java.util.Scanner;

public class ExercicioSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota do aluno: ");
		int x = sc.nextInt();
		switch(x) {
		case 10, 9:
		System.out.println("Excelente");
		break;
		case 8, 7:
		System.out.println("Bom");
		break;
		case 6, 5:
		System.out.println("Regular");
		break;
		case 4, 0:
		System.out.println("Reprovado");
		break;
		default:
		System.out.println("Nota inválida");
		break;
	}

}
}