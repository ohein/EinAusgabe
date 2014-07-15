import java.io.FileReader;
import java.io.IOException;

public class Eingabe {

	public static void main(String[] args) {
		FileReader f;		
		int c;     

		try {
			f = new FileReader("hallo.txt");
		    while ((c = f.read()) != -1) 
		        System.out.print((char)c);
		    f.close();
		}
		
		catch (IOException e) {
			System.out.println("Fehler beim Lesen der Datei");
		}
	}
}
