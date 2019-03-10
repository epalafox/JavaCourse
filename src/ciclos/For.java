package ciclos;

public class For {
	public static void main(String args[])
	{
		int[] arreglo = new int[10];
		for(int a = 1 ; a < 11 ; a++)
		{
			arreglo[a-1] = a;
		}
		for(int b : arreglo)
		{
			System.out.println(b);
		}
	}
}
