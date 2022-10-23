public class FloatArithmeticMean {

	public static void main(String[] args) {
		float sum = 0.0f;
		
		if (args.length == 0) {
			System.out.println("Brak argumentow programu");
		}
		else {
			for (String i : args) {
				float arg = Float.parseFloat(i);
				System.out.printf("%.3f" ,arg);
				System.out.print("\n");
				sum+=arg;
			}
			
			float mean = sum/args.length;
			
			System.out.println("----------");
			System.out.printf("%.3f" ,sum);
			System.out.println();
			
			System.out.print("Srednia arytmetyczna: ");
			System.out.printf("%.4f" ,mean);
			
			
		}
		
		
		
	}

}