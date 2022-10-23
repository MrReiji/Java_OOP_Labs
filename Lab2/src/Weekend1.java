import java.util.Date;

public class Weekend1 {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		int day = new Date().getDay();
		String forma = "dni";
		switch(day) {
			case 0:
				System.out.print("Mamy weekend!");
				break;
			case 1:
				System.out.print("Dziś poniedziałek");
				break;
			case 2:
				System.out.print("Dziś wtorek");
				break;
			case 3:
				System.out.print("Dziś środa");
				break;
			case 4:
				System.out.print("Dziś czwartek");
				forma = "dzień";
				break;
			case 5:
				System.out.print("Dziś piątek");
				break;
			case 6:
				System.out.print("Mamy weekend!");
				break;
			default:
				System.out.print("błąd");
				break;
				}
		
		
			
		
		System.out.println(", do weekendu pozostało " + (5 - day) + " "+forma);	
		
		
				
		

	}

}
