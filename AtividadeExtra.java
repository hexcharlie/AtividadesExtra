package JavaTech;

import java.util.Scanner;

public class AtividadeExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		float nota1,nota2,nota3,nota4;
		
		
		System.out.println("Entre com a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Entre com a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Entre com a nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("Entre com a nota 4: ");
		nota4 = leia.nextFloat();


		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Média: "+media);
		System.out.printf("\nMédia foi de: %.2f",media);
	}

}
