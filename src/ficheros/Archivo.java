package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivo {

	public static void main(String[] args) {
		File file = new File("/home/emmanuel/Documents/myFile.txt");
		//File file = new File("C://Java");
		if(!file.exists())
		{
			try {
				file.createNewFile();
			} catch (IOException e)
			{
				e.printStackTrace();
				return;
			}
		}
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.append("Tercera vez");
			writer.close();
			
			Scanner ent = new Scanner(file);
			while(ent.hasNextLine())
				System.out.println(ent.nextLine());
			ent.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
