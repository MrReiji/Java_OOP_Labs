import javax.swing.JOptionPane;
import java.io.File;

public class LineCounterPane {

    public static void main(String[] args) {

        if (args.length==0) {
            System.out.println("Brak argumentów programu.");
            return;
        }
        File f = new File(args[0]);

        if (f.exists()){
            JOptionPane.showMessageDialog(null, "Nazwa pliku to: " +f.getName(), "Nazwa pliku", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Podany plik nie istnieje!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

}