package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Nota;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Nota nota = new Nota();
		
		
		System.out.println("Digite seu Nome: ");
		nota.nome = sc.nextLine();
		
		System.out.println("Digite suas notas: ");
		nota.nota1 = sc.nextDouble();
		nota.nota2 = sc.nextDouble();
		nota.nota3 = sc.nextDouble();
		
		double med = nota.media();
		
		System.out.printf("Sua média final: %.2f\n ", med);
		
		if(med >= 6.0) {
			System.out.println("Voce foi aprovado!");
		}
		else {
			System.out.println("Voce foi reprovado!!");	
		}
		
		sc.close();
		}
}
