package Prova;

import Prova.BDSimulado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BDSimulado bd=new BDSimulado();
		System.out.println(bd.getInfoPassageiro("Maria da Silva"));
		System.out.println(bd.getQtdeViagens("Maria da Silva"));
		

	}

}
