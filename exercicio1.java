package lacosderepeticao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=0;

Scanner leia= new Scanner(System.in);

for(x=1000;x<=1999; x++)
{
	if (x%11 == 5)
	{
		x=x;
		System.out.println("\n-->"+x);
	}
}
	

	}

}
