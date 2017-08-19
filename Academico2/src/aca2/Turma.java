package aca2;

public class Turma {
	private String cod;
	private String profe;
	private String disc;
	
	public String toString() {
		return "Turma [cod=" + cod + ", profe=" + profe + ", disc=" + disc + ", getCod()=" + getCod() + ", getProfe()="
				+ getProfe() + ", getDisc()=" + getDisc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Turma(String cod, String profe, String disc) {
		this.cod = cod;
		this.profe = profe;
		this.disc = disc;
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
}
	
	
	