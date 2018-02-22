package repeat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
public class FileIO{
	public static void main(String[] args){
 		//Initializing a new File object with actual file path.
		File src = new File("C:\\Users\\deepanshuagarwal\\Documents\\Testing\\Java\\Practise.txt");
		try{
			//Initializing the Scanner with the File object.
			Scanner scanner = new Scanner(src);
                                           //Loop to Read the file one line at a time.
                                           while (scanner.hasNextLine()) {
	                             System.out.println(scanner.nextLine());
	                             }
	                             scanner.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		try {
		    //Initializing a BufferedReader Object with source file path.
		    BufferedReader in = new BufferedReader(new FileReader(src));
		    String str;
		    //Loop to read the file one line at a time.
		    while ((str = in.readLine()) != null)
		        System.out.println(str);
		    in.close();
		} catch (Exception e) {
		}
	}
}
