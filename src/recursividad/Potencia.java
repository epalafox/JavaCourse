package recursividad;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduce el número");
		int a = ent.nextInt();
		System.out.println("Introduce la potencia");
		int b = ent.nextInt();
		System.out.println(Pow(a, b));
		ent.close();
	}
	private static int Pow(int numero, int potencia)
	{
		if(potencia != 1)
			return numero * Pow(numero, potencia - 1);
		else
			return numero;
	}
}
