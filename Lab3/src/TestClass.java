import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    private static List<TestClass> objects = new ArrayList<>();

    private final Instant timeStamp = Instant.now();
    private int id = 0;

    TestClass() {
    	objects.add(this);
        id = objects.size();
        System.out.println("Stworzono obiekt nr " + id + " w momencie: " + timeStamp.toEpochMilli());
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Brak argumentów");
            return;
        } else {
            int numberOfInstances = Integer.parseInt(args[0]);
            for (int i = 0; i < numberOfInstances; i++) {
                new TestClass();
            }
            System.out.println("Liczba obiektów: " + String.valueOf(numberOfInstances));
        }


    }
}