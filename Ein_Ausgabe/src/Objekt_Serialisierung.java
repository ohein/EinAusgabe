import java.io.*;

public class Objekt_Serialisierung {

	public static void main(String[] args) throws Exception {
		
		ObjectOutputStream out =
		   new ObjectOutputStream (new FileOutputStream ("Personen.ddb"));

		Person p1 = new Person("Hans", "Müller", 23);
		Person p2 = new Person("Peter", "Maier", 26);
		
	    out.writeObject(p1);
	    out.writeObject(p2);
	    out.close();   
	    
	    ObjectInputStream in =
	 		   new ObjectInputStream (new FileInputStream ("Personen.ddb"));
	    
	    p1 = ((Person) in.readObject()); // expliziter Cast notwendig!
	    p2 = ((Person) in.readObject());
	    
	    p1.print();
	    p2.print();
	    
	    in.close();    
	}
}
