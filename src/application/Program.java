package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno al = new Aluno(null, null, null, null, null, null);
		System.out.println(al);
		sc.close();
	}

}
