package suma;

import java.util.Scanner;

public class Suma {

	public static void main(String args[])
	{
		Scanner ent = new Scanner(System.in);
		System.out.println("Favor de ingresar a");
		int a = ent.nextInt();
		System.out.println("Favor de ingresar b");
		int b = ent.nextInt();
		int c = a + b;
		System.out.println(c);
		ent.close();
	}
}
