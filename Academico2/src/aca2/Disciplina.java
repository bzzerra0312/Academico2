package aca2;

public class Disciplina {
	private String nome;
	private String curso;
	private int CH;
	
	public String toString() {
		return "Disciplina [nome=" + nome + ", curso=" + curso + ", CH=" + CH + ", getNome()=" + getNome()
				+ ", getCurso()=" + getCurso() + ", getCH()=" + getCH() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Disciplina(String nome, String curso, int cH) {
		this.nome = nome;
		this.curso = curso;
		this.CH = cH;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCH() {
		return CH;
	}
	public void setCH(int cH) {
		this.CH = cH;
	}
	

}
