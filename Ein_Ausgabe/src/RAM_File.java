import java.io.*;

public class RAM_File {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile ram1 = new RandomAccessFile("ram_file.txt", "rw");
		int i;
		
		for (i=0;i<=10;i++)
			ram1.write(i);
		
		ram1.seek(4);
		ram1.write(0);
		ram1.seek(0);
		
		for (i=0;i<=10;i++)
			System.out.println(ram1.read());
			
		ram1.close();
	}

}
