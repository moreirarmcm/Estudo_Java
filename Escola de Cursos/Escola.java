package escolaCursos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import EstudoJava.Curso;

public class Escola {

	public static void main(String[] args) {
		List<Cursos> cursos = new ArrayList<Cursos>();
		cursos.add(new Cursos("Programação Java", 101));
		cursos.add(new Cursos("Banco de Dados SQL", 28));
		cursos.add(new Cursos("Design Gráfico", 40));
		cursos.add(new Cursos("Programação em Python", 89));
		cursos.add(new Cursos("C# Descomplicado", 37));
		cursos.add(new Cursos("Desenvolvimento Unity", 30));
			//cursos.forEach(System.out::println);
		//cursos.stream().filter(c -> c.getQtdAlunos() > 50).forEach(System.out::println);
		//cursos.sort(Comparator.comparing( c -> c.getQtdAlunos()));
		//cursos.forEach(System.out::println);
		//cursos.stream().filter(c -> c.getQtdAlunos() >= 30).map(Cursos::getQtdAlunos).forEach(System.out::println);
		cursos.stream()
		.collect(Collectors.toMap(Cursos::getNome, Cursos::getQtdAlunos))
		.forEach( (nomeDoCurso, alunosNoCurso) -> {
			System.out.println("O curso -" + nomeDoCurso + "- tem " + alunosNoCurso + " alunos.");
		});
		System.out.println("------------------------------");
		int soma_alunos = cursos.stream()
				.filter(c -> c.getQtdAlunos() > 0)
				.mapToInt(Cursos::getQtdAlunos).sum();
		System.out.println("A escola possui " + soma_alunos + " alunos matriculados.");
		//Use ParallelStream para usar threads simultâneas (vale a pena apenas para grandes quantidades de dados.
	}
}
