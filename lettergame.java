import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class lettergame {
	
	static List<String> englishLetters = new ArrayList<String>();
	static List<String> spanishLetters = new ArrayList<String>();

	
	public static void main(String[] args)
	{
		getLetters();
	}
	
	// Get letters from csv file
	public static void getLetters()
	{
		// CSV File location
		String file = "language.csv";
		String row = "";
		
		// Store each letter using array list
		try
		{
			BufferedReader read = new BufferedReader(new FileReader(file));	// Read from the file
			
			while((row = read.readLine()) != null)
			{
				String [] storeLanguage = row.split(",");
				

				englishLetters.add(storeLanguage[0]);
				spanishLetters.add(storeLanguage[1]);
			}
			
			englishLetters.removeIf(String::isEmpty);
			spanishLetters.removeIf(String::isEmpty);
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	
		/*for(int i = 0; i < englishLetters.size(); i++){
                    System.out.print(englishLetters.get(i));
                }
                System.out.println();
                for(int k = 0; k < spanishLetters.size(); k++){
                     System.out.print(spanishLetters.get(k));
                }*/
	}
}
