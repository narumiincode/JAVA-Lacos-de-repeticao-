package lacosderepeticao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int x, soma = 0;

		do {

			System.out.println("\n digite um numero:");
			x = leia.nextInt();
			x = x;
			soma = soma + x;

		} while (x != 0);

		System.out.printf("\n total:" + soma);

	}
}
