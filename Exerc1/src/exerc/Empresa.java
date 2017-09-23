package exerc;

public class Empresa {
	//Atributos
	private String nome;
	private String cnpj;
	private String cidade;
	private String UF;
	
	public Empresa(String nome, String cnpj, String cidade, String uF) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.cidade = cidade;
		UF = uF;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
