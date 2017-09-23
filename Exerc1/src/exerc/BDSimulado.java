package exerc;

import java.util.ArrayList;

public class BDSimulado {
	private ArrayList<Contatos> contatos;
	private ArrayList<Pessoa> pessoa;
	private ArrayList<Empresa> empresa;
	
	  public BDSimulado(){
		  //Instaciando as listas 
		  this.contatos = new ArrayList<Contatos>();
		  this.pessoa = new ArrayList<Pessoa>();
		  this.empresa = new ArrayList<Empresa>();
		  
		  //Criar contatos
		  
		  Contatos c1 = new Contatos("Jorginho", "10/02/1989",true , "Brasília", "DF" );
		  Contatos c2 = new Contatos("Cleide", "10/04/1992",false , "São Paulo", "SP" );
		  Contatos c3 = new Contatos("Maria Dolores", "22/02/1979",false , "Brasília", "DF" );
		  Contatos c4 = new Contatos("Cleiton Rasta", "03/11/2000",true , "Brasília", "DF" );
		  Contatos c5 = new Contatos("Marquinhos", "16/06/1996",true , "João Pessoa", "PB" );
		  Contatos c6 = new Contatos("Tulio", "28/03/1993",true , "Poconé", "MT" );
		  Contatos c7 = new Contatos("Juliana", "02/09/1998",false , "Rio de Janeiro", "RJ" );
		  Contatos c8 = new Contatos("Manuel", "31/12/1999",true , "Manaus", "AM" );
		  Contatos c9 = new Contatos("Priscila", "12/12/2012",true , "João Pessoa", "PB" );
		  Contatos c10 = new Contatos("Giovanna", "20/01/1997",false , "Brasília", "DF" );
		  
		  //Adicionar contatos
		  
		  this.contatos.add(c1);
		  this.contatos.add(c2);
		  this.contatos.add(c3);
		  this.contatos.add(c4);
		  this.contatos.add(c5);
		  this.contatos.add(c6);
		  this.contatos.add(c7);
		  this.contatos.add(c8);
		  this.contatos.add(c9);
		  this.contatos.add(c10);
		  
		  //Criar Pessoa
		  
		  Pessoa p1 = new Pessoa("6133024545" ,"61992666556" ,"Jorginho_ben10@hotmail.com");
		  Pessoa p2 = new Pessoa("1120231212" ,"11992866856" ,"Cleide0492@gmail.com");
		  Pessoa p3 = new Pessoa("" ,"61997465568" ,"");
		  Pessoa p4 = new Pessoa("" ,"" ,"cabecadegelo@hotmail.com");
		  Pessoa p5 = new Pessoa("6133024545" ,"61992666556" ,"Jorginho_ben10@hotmail.com");
		  Pessoa p6 = new Pessoa("6133024545" ,"61992666556" ,"Jorginho_ben10@hotmail.com");
		  Pessoa p7 = new Pessoa("6133024545" ,"61992666556" ,"Jorginho_ben10@hotmail.com");
		  Pessoa p8 = new Pessoa("6133024545" ,"61992666556" ,"Jorginho_ben10@hotmail.com");
		  Pessoa p9 = new Pessoa("6133024545" ,"61992666556" ,"Jorginho_ben10@hotmail.com");
		  Pessoa p10 = new Pessoa("6133024545" ,"61992666556" ,"Jorginho_ben10@hotmail.com");
		  
		  
		  
		  
		  
		  
		  
		  
	  }

}
