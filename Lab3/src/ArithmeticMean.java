public class ArithmeticMean {

	public static void main(String[] args) {
		
		int sum = 0;
		
		System.out.print("Srednia liczb: ");
		
		for (String i : args) {
			int arg = Integer.parseInt(i);
			System.out.print(arg+", ");
			sum+=arg;
		}
		System.out.print("wynosi: ");
		int mean = sum/args.length;
		System.out.println(mean);
		

	}

}
