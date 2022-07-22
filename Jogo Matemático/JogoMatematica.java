package JogoMatematico;

import java.util.Scanner;

public class JogoMatematica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha;
		int score = 0;
		do {
			int dificuldade, num1, num2;
			System.out.println("Digite a dificuldade: \nEntre 1 e 4");
			dificuldade = sc.nextInt();

			Calculadora calc = new Calculadora(dificuldade);
			score += calc.VerificaOperacao(sc.nextInt());
			System.out.println("Sua pontuação é: " + score + ".\nDeseja continuar??\n <1> para sim   <0> para não");
			escolha = sc.nextInt();
		} while (escolha == 1);
	}

}
