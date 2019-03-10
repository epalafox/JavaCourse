package cadenas;

public class Cadenas {

	public static void main(String[] args) {
		String hello = "Hola Mundo";
		char[] arreglo = hello.toCharArray();
		System.out.println(arreglo);
		hello = "";
		/*for(char a : arreglo)
		{
			hello = a + hello; 
		}*/
		for(int a = arreglo.length ; a > 0 ; a--)
		{
			hello = hello + arreglo[a - 1];
		}
		System.out.println(hello);
	}

}
