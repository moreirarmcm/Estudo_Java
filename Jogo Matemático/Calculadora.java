package JogoMatematico;

import java.util.Random;

public class Calculadora {

	private int dificuldade;
	private int num1;
	private int num2;
	private int resultado;
	String operacao;

	Random r = new Random();

	public Calculadora(int dificuldade) {
		this.dificuldade = dificuldade;
		setNum1(r.nextInt(10 * dificuldade));
		setNum2(r.nextInt(6 * dificuldade));
		setResultado(resultado = getOperacao(r.nextInt(4), getNum1(), getNum2()));

		System.out.println("Qual o resultado da " + operacao + " de " + getNum1() + " por " + getNum2() + "?");
	}

	public int VerificaOperacao(int escolha) {
		if (escolha == getResultado()) {
			System.out.println("Você acertou!!");
			return 1;
		} else {
			System.out.println("Você errou, o resultado correto é " + getResultado());
			return 0;
		}
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

	public int getOperacao(int random, int num1, int num2) {
		int y;
		switch (random) {
		case 0: // Soma
			this.operacao = "soma";
			y = num1 + num2;
			break;
		case 1: // Diminuir
			this.operacao = "subtração";
			y = num1 - num2;
			break;
		case 2: // Multiplicar
			this.operacao = "multiplicação";
			y = num1 * num2;
			break;
		case 3: // Dividir
			this.operacao = "divisão";
			y = num1 / num2;
			break;
		default:
			y = 0;
		}
		return y;

	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
