package aca2;

public class Professor {
private String nome;
private String matricula;
private String titul;
private String CPF;

public String toString() {
	return "Professor [nome=" + nome + ", matricula=" + matricula + ", titul=" + titul + ", CPF=" + CPF + ", getNome()="
			+ getNome() + ", getMatricula()=" + getMatricula() + ", getTitul()=" + getTitul() + ", getCPF()=" + getCPF()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public Professor(String nome, String matricula, String titul, String cPF) {
	this.nome = nome;
	this.matricula = matricula;
	this.titul = titul;
	this.CPF = cPF;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public String getTitul() {
	return titul;
}
public void setTitul(String titul) {
	this.titul = titul;
}
public String getCPF() {
	return CPF;
}
public void setCPF(String cPF) {
	this.CPF = cPF;
}

}
