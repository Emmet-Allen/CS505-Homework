import java.io.File;
import java.util.Scanner;

public class IOTest{

	public static void main(String[] args) throws Exception {
	
	File textFile = new File("hwk9text.txt");
	Scanner scan = new Scanner(textFile);
	int wordCounter = 0; 
	int lineCounter = 0; 
	
		while(scan.hasNextLine()){
		String line = scan.nextLine();
		lineCounter++;
		String[] words = line.split(" ");

			for(int i = 0; i < words.length; i++){ 
				if(words.length > 1){ //Have words.length be greater than 1 because if it is 1 then we know words only contains the null-terminator 
				wordCounter++; // We can treat any char in words that is not the null-terminator as a string via formal deffinition of string = char[]
				System.out.println("This is a word: " + words[i] + " " + wordCounter);
				}
			}
			
		System.out.println("This is a line: " + line + " " + lineCounter); 
		}
		
	System.out.println("This is how many lines: " + lineCounter); 
	System.out.println("This is how many words: " + wordCounter); 
	}
}