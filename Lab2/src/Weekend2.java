import java.util.Date;

public class Weekend2 {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		int day = new Date().getDay();
		System.out.print("Dziś jest ");
		switch(day) {
			case 0:
				System.out.print("weekend");
				break;
			case 1:
				System.out.print("poniedziałek");
				break;
			case 2:
				System.out.print("wtorek");
				break;
			case 3:
				System.out.print("środa");
				break;
			case 4:
				System.out.print("czwartek");
				break;
			case 5:
				System.out.print("piątek");
				break;
			case 6:
				System.out.print("weekend");
				break;
			default:
				System.out.print("błąd");
				break;
				}
		
		

	}

}
