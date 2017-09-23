package exerc;

public class Contatos {
	//Atributos
	private String nome;
	private String datan;
	private boolean sex;
	private String cidade;
	private String UF;
	
	public Contatos(String nome, String datan, boolean sex, String cidade, String uF) {
		this.nome = nome;
		this.datan = datan;
		this.sex = sex;
		this.cidade = cidade;
		UF = uF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatan() {
		return datan;
	}
	public void setDatan(String datan) {
		this.datan = datan;
	}
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	

}
