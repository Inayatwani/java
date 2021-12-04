package inayat;
import java.lang.String;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Filepractice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		//creating a folder
		File f = new File("/home/inayat/Desktop/Inayat");
		f.mkdir();
		
		//creating a file
		try {
			FileWriter fw = new FileWriter(f+File.separator+"def.txt");
			//FileWriter fw = new FileWriter(f+"/abc.txt");
			System.out.println("please enter your name ");
			String name = s.nextLine();
			fw.write(name);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//reading a file 
		File f1 = new File("/home/inayat/Desktop/Inayat/abc.txt");
		try {
			Scanner scannerFile = new Scanner(f1);	
			while(scannerFile.hasNextLine()) {
				
				System.out.println(scannerFile.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//deleting a file 
		//f1.delete();
		
	}

}
