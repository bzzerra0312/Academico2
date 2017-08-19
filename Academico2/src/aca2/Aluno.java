package aca2;

import java.util.Calendar;

public class Aluno {
	private String nome;
	private String RA;
	private String sexo;
	private Calendar DN;
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", RA=" + RA + ", sexo=" + sexo + ", DN=" + DN + ", getNome()=" + getNome()
				+ ", getRA()=" + getRA() + ", getSexo()=" + getSexo() + ", getDN()=" + getDN() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Aluno(String nome, String rA, String sexo, Calendar dN) {
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
	public Calendar getDN() {
		return DN;
	}
	public void setDN(Calendar dN) {
		DN = dN;
	}
	 

}
