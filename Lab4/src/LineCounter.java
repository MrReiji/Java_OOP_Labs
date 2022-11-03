import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {

	public static void main(String[] args) {
		
		if (args.length==0) {
			System.out.println("Brak argumentów programu.");
			return;
		}
		
		try {
			BufferedReader	reader = new BufferedReader(new FileReader(args[0]));
			int lines = 0;
			while (reader.readLine() != null) lines++;
			reader.close();
			System.out.println(lines);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();	
		}

		
		
		
	}

}
