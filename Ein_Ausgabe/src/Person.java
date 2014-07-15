import java.io.*;

public class Person implements Serializable {
	
	public String vorname;
	public String nachname;
	public int alter;
	
	static final long serialVersionUID = 1L; // Objekttyp 1 Long
	
	public Person (String vorname, String nachname, int alter) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}
	
	public void print(){
		System.out.println(this.vorname + "  ");
		System.out.println(this.nachname + "  ");
		System.out.println(this.alter);
	}
}
