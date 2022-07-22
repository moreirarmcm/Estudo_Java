package escolaCursos;

public class Cursos {
	String nome;
	int qtd_alunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtdAlunos() {
		return qtd_alunos;
	}
	public void setQtdAlunos(int qtdAlunos) {
		this.qtd_alunos = qtdAlunos;
	}
	
	public Cursos(String nome, int qtdAlunos) {
		this.nome = nome;
		this.qtd_alunos = qtdAlunos;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" + getNome() + ", " + getQtdAlunos() + "}";
	}
}
