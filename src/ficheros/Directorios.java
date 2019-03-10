package ficheros;

import java.io.File;

public class Directorios {

	public static void main(String[] args) {
		File file = new File("/home/emmanuel/Documents");
		if(file.isDirectory())
			for(File child : file.listFiles())
				System.out.println(child.getAbsolutePath());
	}

}
