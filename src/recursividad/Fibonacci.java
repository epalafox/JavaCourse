package recursividad;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Cuántos números deseas ver?");
		int a = ent.nextInt();
		for(int i = 0; i < a; i++)
		{
			System.out.println(fibonacci(i) + ", ");
		}
		ent.close();
	}
	private static int fibonacci(int numero)
	{
		if(numero == 0 || numero == 1)
			return numero;
		else
			return fibonacci(numero - 1) + fibonacci(numero - 2);
	}
}
