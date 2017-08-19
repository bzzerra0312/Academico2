package aca2;

import java.util.Calendar;

public class Principal {
	public static void main(String[] args){
		Calendar dataNascA1 = Calendar.getInstance();
		dataNascA1.set(Calendar.YEAR, 1996);
		dataNascA1.set(Calendar.MONTH, Calendar.DECEMBER);
		dataNascA1.set(Calendar.DAY_OF_MONTH, 03);
		
		Aluno a1 = new Aluno("Renan" , "123" , "M" , dataNascA1);
		Disciplina d1 = new Disciplina("LTP1" , "CIÊNCIA DA COMPUTAÇÃO" , 40);
		Professor p1 = new Professor("Marcos", "312", "Mestrado", "12345678");
		Turma t1 = new Turma("Turma A",p1,d1);
		
		
		
	}

}
