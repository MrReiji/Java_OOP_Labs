public class ArithmeticMean {

	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("Brak argumentów programu.");
			return;
		}
			
		int sum = Integer.parseInt(args[0]);
			
		System.out.print("Srednia liczb: " + args[0]);
			
		for (int i = 1; i<args.length;i++) {
				System.out.print(", "+args[i]);
				sum+=Integer.parseInt(args[i]);
			} 
		System.out.println(" wynosi " + sum/args.length + (sum%args.length!=0 ? (", reszta: "+ sum%args.length) : ""));
				
	}

}

