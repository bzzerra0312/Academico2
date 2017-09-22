package Prova;

public class Viagem {
	//Atributos
	private int codigo;
	private int mes;
	private int ano;
	private Passageiro passageiro;
	private String motoca;
	private double dist;
	private double valor;
	private String city;
	private String UFs;
	
	//Metodo construtor
	public Viagem(int codigo, int mes, int ano, Passageiro passa, String motoca, double dist, double valor, String city,
			String uFs) {
		this.codigo = codigo;
		this.mes = mes;
		this.ano = ano;
		this.passageiro = passa;
		this.motoca = motoca;
		this.dist = dist;
		this.valor = valor;
		this.city = city;
		UFs = uFs;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Passageiro getPassa() {
		return passageiro;
	}
	public void setPassa(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	public String getMotoca() {
		return motoca;
	}
	public void setMotoca(String motoca) {
		this.motoca = motoca;
	}
	public double getDist() {
		return dist;
	}
	public void setDist(double dist) {
		this.dist = dist;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getUFs() {
		return UFs;
	}
	public void setUFs(String uFs) {
		UFs = uFs;
	}
	
	
	
	

}
