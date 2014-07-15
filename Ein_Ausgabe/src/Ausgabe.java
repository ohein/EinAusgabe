import java.io.*;

public class Ausgabe {

	public static void main(String[] args) {

		FileWriter f1;
		String hello = "Hallo JAVA\r\n";
	     
	    try {
	       f1 = new FileWriter("hallo.txt");
	       f1.write(hello);
	       f1.close();
	    }
	      
	    catch (IOException e) {
	         System.out.println("Fehler beim Erstellen der Datei");
	    }
	}
}
