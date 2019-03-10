package mod;

import java.util.Scanner;

public class Mod {
	public static void main(String args[])
	{
		Scanner ent = new Scanner(System.in);
		System.out.println("Ingresa un número");
		int a = ent.nextInt();
		if(a % 2 == 0)
		{
			System.out.println("Es un número par");
		}
		else
		{
			System.out.println("Es un número impar");
		}
		ent.close();
	}
}
