package ciclos;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int a;
		int b = 0;
		System.out.println("Ingresa un número, 0 para terminar");
		a = ent.nextInt();
		/*while(a != 0)
		{
			b += a;
			System.out.println("Ingresa un número, 0 para terminar");
			a = ent.nextInt();
		}*/
		do {
			b += a; 
			System.out.println("Ingresa un número, 0 para terminar");
			a = ent.nextInt();			
		}while(a != 0);
		System.out.println(b);
		ent.close();
	}

}
