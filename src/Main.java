import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		System.out.println("Witaj! Teraz jest: " + new SimpleDateFormat("yyyy.MM.dd HH:mm").format(new Date()));
	}

}
