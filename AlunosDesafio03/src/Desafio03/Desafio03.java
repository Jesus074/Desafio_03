package Desafio03;

import java.util.Scanner;

class Student {
	String nome;
	String idade;
	int nota;
	public Student() {
		this(" ", " ", 0);
	}
	public Student(String Nome, String Idade, int Nota) {
		nome = Nome;
		idade = Idade;
		nota = Nota;
	}
}

public class Desafio03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a quantidade de alunos? ");
		/**int n = Integer.parseInt(in.nextLine().trim());*/
		int alunos = in.nextInt();
		System.out.println("A quantidade de alunos é: " + alunos);
		
		
		Student stu = new Student(" ", " ", 0);
		Student max = new Student(" ", " ", 0);
		Student min = new Student(" ", " ", 0);
	
		for(int i = 1; i <= alunos; i++) {
			System.out.println("Qual o nome do aluno?");
				String nome = in.next();
				System.out.println("Qual é a idade do aluno?");
				String idade = in.next();
			System.out.println("Qual a nota do aluno?");
				int nota = in.nextInt();
			
			if (max.nota < nota) {
				max.nome = nome;
				max.idade = idade;
				max.nota = nota;
			}
			
			if (min.nota > nota) {
				min.nome = nome;
				min.idade = idade;
				min.nota = nota;
			}
		}
		System.out.println("Nome e nota do aluno com maior pontuação :");
		System.out.println(max.nome + " " + max.nota);
		System.out.println("obrigado");
		in.close();
	}
}