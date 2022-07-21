package Comparando_Strings;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Recebe um conjunto de frases, ordena as frases de acordo com seus tamanhos e salva as frases em um arquivo de texto.
 * 
 * @author Renan Moreira
 *
 */
public class ComparaPalavras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Comparator<String> comparando = new Comparacao(); // Classe Comparacao implementa Comparator.
		List <String> frases = new ArrayList<String>();
		int contador = 0;
		System.out.println("Quantas linhas de frases você irá inserir?");

		try {
			contador = Integer.parseInt(sc.nextLine());
		} catch (java.lang.NumberFormatException e) {
			System.out.println("O valor digitado não é um número inteiro.");
		}
		
		for (int i = 0; i < contador; i++) {
			System.out.println("Digite a " + (i+1) + "ª frase");
			frases.add(sc.nextLine());
		}
		Collections.sort(frases, comparando); //Ordena a lista usando, como parâmetro, o método 'compare' da classe Comparacao.
		frases.forEach(s -> System.out.println(s));
		System.out.println("Deseja salvar essas frases em um arquivo de texto? \n   <1> para sim <0> para não");
		int salva_arquivo = (sc.nextInt() == 1) ? 1 : 0;
		if (salva_arquivo == 1){
			try {
				PrintStream texto = new PrintStream("Frases.txt"); // Cria um arquivo de texto 
				texto.println(frases); 
				texto.close();
				System.out.println("Arquivo de texto salvo.");
			} catch (FileNotFoundException e) {
				System.out.println("Não foi possível salvar o arquivo de texto");
				e.printStackTrace();
			}
		}
	}
}
