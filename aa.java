import java.util.Scanner;
import java.io.*;
class aa{
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter("aa.txt"));
			System.out.println("Enter the contents to be writtern in file:");
			String str = br.readLine();
		    writer.write(str);
		    writer.close();
		    System.out.println("The contents of the file are:");
		    BufferedReader br2 = new BufferedReader(new FileReader("aa.txt"));
	        String st;
	        while ((st = br2.readLine()) != null)
	            System.out.println(st);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}