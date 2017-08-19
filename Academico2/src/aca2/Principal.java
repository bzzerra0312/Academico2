package aca2;
import java.time.LocalDate;
import java.util.ArrayList;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;


public class Principal {
	public static void main(String[] args){
	
		Aluno a1 = new Aluno("Renan" , "123" , "M" , LocalDate.of(1996, 12, 03));
		Aluno a2 = new Aluno("Giovanna" , "111" , "F" , LocalDate.of(1990, 12, 20));
		Aluno a3 = new Aluno("Guilherme" , "112" , "M" , LocalDate.of(1986, 10, 02));
		Aluno a4 = new Aluno("Vitoria" , "113" , "F" , LocalDate.of(1982, 04, 15));
		Aluno a5 = new Aluno("João" , "114" , "M" , LocalDate.of(1997, 12, 05));
		Disciplina d1 = new Disciplina("LTP1" , "CIÊNCIA DA COMPUTAÇÃO" , 40);
		Professor p1 = new Professor("Marcos", "312", "Mestrado", "12345678");
		Turma t1 = new Turma("Turma A",p1,d1);
		
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
		t1.adicionarAluno(a3);
		t1.adicionarAluno(a4);
		t1.adicionarAluno(a5);
		
		
		
		for (int i = 0; i < t1.getAlunos().size(); i++) {
			System.out.println(t1.getAlunos().get(i).getNome());
			
		}
		
		System.out.println(a1.getNome());
		System.out.println(d1.getNome());
		System.out.println(p1.getNome());
		System.out.println(t1.getCod());
		
	
		System.out.println(t1.getAlunos().get(0).getNome());

		for (int i = 1; i <3 ; i++) {
			System.out.println("ii");
			System.out.println("Reprovado");	
		}
		for (int i = 3; i < 6; i++) {
			System.out.println("mi");
			System.out.println("Reprovado");
		}
		for (int i = 6; i < 8; i++) {
			System.out.println("mm");
			System.out.println("Aprovado");
		}
		for (int i = 7; i < 9; i++) {
			System.out.println("ms");
			System.out.println("Aprovado");
		}
		for (int i = 9; i < 11; i++) {
			System.out.println("ss");
			System.out.println("Aprovado");
			
		}
		
		
		
		
		
		
	
		
		
		
	}

}
