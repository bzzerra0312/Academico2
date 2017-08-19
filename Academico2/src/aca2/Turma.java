package aca2;

import java.util.ArrayList;

public class Turma {
	private String cod;
	private String profe;
	private String disc;
	private ArrayList<Aluno> alunos;
	
	public String toString() {
		return "Turma [cod=" + cod + ", profe=" + profe + ", disc=" + disc + ", getCod()=" + getCod() + ", getProfe()="
				+ getProfe() + ", getDisc()=" + getDisc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Turma(String cod, Professor p1, Disciplina d1) {
		this.cod = cod;
		this.profe = p1;
		this.disc = d1;
		
		
		
		
	}
	
	public ArrayList<Aluno> getAlunos(){
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno>alunos){
		this.alunos = alunos;
		
	}
	public void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		
	}
	
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getProfe() {
		return profe;
	}
	public void setProfe(String profe) {
		this.profe = profe;
	}
	public String getDisc() {
		return disc;
	}
	public void setDisc(String disc) {
		this.disc = disc;
	}
	
	public String litarAlunos(){
		String retorno = "";
	
		for (int i = 0; i < this.alunos.size(); i++) {
			System.out.println(this.alunos.get(i).getNome() + "\n");
			
			retorno=retorno + "Nome: " + this.alunos.get(i).getNome() + "n";
		
	}
	return retorno;
	}
}
	
	
	