package lacosderepeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia= new Scanner(System.in);
		
		int x, total, par=0,impar;
				
		for (total=0;total<10; total++)
		{
			System.out.println("\n digite um n�mero:");
			x=leia.nextInt();
		
					
			if (x %2==0)
			par++;
		}
		System.out.printf("\n o toal de n�meros pares � "+par);
	
		impar=10-par;
		System.out.printf("\n o total de n�meros impares � %d",impar);
		}
	}



