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
			
			for(int i = l; i==0; i--) {
				System.out.println(" ".repeat(i-1)+"#".repeat(i)+" ".repeat(i-1));			
			}
			
		
		sc.close();
	}
}
