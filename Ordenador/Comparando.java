package TestandoOrdenador_001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparando {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		Comparador c = new Comparador();
		
		palavras.add("Renan");
		palavras.add("Marcelino");
		palavras.add("Rayane");
		palavras.add("Tomada");
		palavras.add("Castro Moreira");
		Collections.sort(palavras, c);
		System.out.println(palavras);
	}
}
