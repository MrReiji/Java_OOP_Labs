import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!(sc.hasNextInt())){
            System.out.println("Blad danych wejsciowych");
            sc.close();
            return;
        }

        int l = sc.nextInt();

        if (l<=0) {
            System.out.println("Blad danych wejsciowych");
            sc.close();
            return;
        }

        System.out.println("#".repeat(l));
        for (int i = 0; i<l-2;i++) {
            System.out.println("#"+ " ".repeat(l-2)+"#");
        }
        System.out.println("#".repeat(l));


        sc.close();
    }
}