import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {

    public static void main(String[] args) {

        if (args.length==0) {
            System.out.println("Brak argumentów programu.");
            return;
        }

        try {
            BufferedReader	reader = new BufferedReader(new FileReader(args[0]));
            String line;
            int lines = 0;
            int characters = 0;
            int words = 0;
            while ((line = reader.readLine()) != null) {
                characters += line.length();
                words += (line.split("\\s+")).length;
                lines++;
            }
            reader.close();
            System.out.println("Wierszy: "+ lines);
            System.out.println("Znaków: "+ characters);
            System.out.println("Słów: "+ words);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}