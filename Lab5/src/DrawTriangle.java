import java.util.Scanner;

public class DrawTriangle {

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

        for(int i = 1; i<l+1; i++) {
            System.out.println(" ".repeat(l-i)+"#".repeat(i*2-1)+" ".repeat(l-i));
        }


        sc.close();
    }
}