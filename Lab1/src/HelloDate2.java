import java.text.SimpleDateFormat;
import java.util.Date;


public class HelloDate2 {

	public static void main(String[] args) {
		System.out.println(new SimpleDateFormat("'Witaj! Teraz jest:' yyyy.MM.dd HH:mm").format(new Date()));

	}

}
