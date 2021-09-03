package lacosderepeticao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia= new Scanner(System.in);
		
		int idade,vinteeum=0,cinquenta=0;
		System.out.println("\n digite sua idade:");
		idade=leia.nextInt();
	
		while(idade!=-99)
		{
	
			if (idade<=21)
			
				vinteeum++;
			
			if(idade>=50)
			
				cinquenta++;
			
		System.out.println("\n para encerar digite -91:");
		idade=leia.nextInt();
		}
	
		System.out.printf("\n menores de 21:"+vinteeum);
		System.out.printf("\n maiores de 50:"+cinquenta);
	

}}



