
public class CommandLineArguments {

	public static void main(String[] args) {
		if (args.length == 0){
			System.out.println("Brak argumentów programu");
		}
		else {
			System.out.println("Liczba argumentów: "+ args.length);
			int counter = 1;
			for(String arg: args) {
				System.out.print(counter);
				System.out.println(". "+arg);
				counter++;
			}
		}

	}

}
