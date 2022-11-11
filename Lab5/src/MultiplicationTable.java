import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        {
            Properties p = new Properties();
            try {
                FileReader reader = new FileReader("Properties.properties");
                p.load(reader);
                int minVal = Integer.parseInt(p.getProperty("wartość_minimum"));
                int maxVal = Integer.parseInt(p.getProperty("wartość_maximum"));
                int prc = Integer.parseInt(p.getProperty("procent"));
                int minRep = Integer.parseInt(p.getProperty("powtórzeń_minimum"));
                int maxRep = Integer.parseInt(p.getProperty("powtórzeń_maximum"));

                int counter = 0;
                int correct = 0;
                Random random = new Random();
                while(counter<minRep || ((counter!=0 ? (prc > correct*100/counter) : true)) && (counter<maxRep)){
                    int val1 = random.nextInt(minVal, maxVal);
                    int val2 = random.nextInt(minVal, maxVal);
                    System.out.print(val1+ " * " + val2 + " = ");
                    Scanner sc = new Scanner(System.in);

                    while (!(sc.hasNextInt())){
                        System.out.println("Wprowadzono niepoprawny typ danych, powtorz wprowadzanie odpowiedzi");
                        System.out.print(val1+ " * " + val2 + " = ");
                        sc = new Scanner(System.in);
                    }

                    if (sc.nextInt() == val1*val2) {
                        correct++;
                    }
                    counter++;
                }

                System.out.println("Liczba poprawnie odpowiedzianych pytan: " + correct);
                System.out.println("Liczba wszystkich pytan: " + counter);
                System.out.println("Procent poprawnych odpowiedzi: " + correct*100/counter+"%");




            } catch (FileNotFoundException e) {
                try {
                    FileWriter pFile = new FileWriter("Properties.properties");
                    p.setProperty("wartość_minimum", "1");
                    p.setProperty("wartość_maximum", "10");
                    p.setProperty("procent", "70");
                    p.setProperty("powtórzeń_minimum", "10");
                    p.setProperty("powtórzeń_maximum", "25");
                    p.store(pFile, "Properties for MultiplicationTable");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
