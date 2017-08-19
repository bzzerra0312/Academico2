package aca2;


import java.time.LocalDate;


public class Aluno {
	private String nome;
	private String RA;
	private String sexo;
	private LocalDate DN;
	
	
	
	
	public String toString() {
		return "Aluno [nome=" + nome + ", RA=" + RA + ", sexo=" + sexo + ", DN=" + DN + ", getNome()=" + getNome()
				+ ", getRA()=" + getRA() + ", getSexo()=" + getSexo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public Aluno(String nome, String rA, String sexo, LocalDate dN) {
		this.nome = nome;
		this.RA = rA;
		this.sexo = sexo;
		this.DN = dN;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	} 


