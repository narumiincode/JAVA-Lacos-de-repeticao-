package lacosderepeticao;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leia= new Scanner(System.in);
	int x,media,soma=0,contx=0,conty=0,contotal;
		do {
				System.out.printf("\n digite um numero");
				x=leia.nextInt();
				
			  if (x %3==0 && x!=0)
			  {
			    x=x;
			    soma=soma+x;
			    contx++;
			  } 
			  }while(x!=0);
    
	media=soma/contx;
	
	System.out.printf("\n soma:"+soma);
	System.out.printf("\n contador x:"+contx);
	System.out.printf("\n média: "+media);	
	
	
}

}
