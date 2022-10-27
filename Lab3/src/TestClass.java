import java.time.Instant;

public class TestClass {

    private final Instant timeStamp = Instant.now();
    private static int count = 0;
    private int id;

    TestClass() {
        count++;
        this.id = count;
        System.out.println(this.id + ". " + "[" + this.timeStamp.toEpochMilli() + "]");
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Brak argumentów programu.");
            return;
        } 
           for (int i = 0; i < Integer.parseInt(args[0]); i++) {
               new TestClass();
           }
           System.out.println("Liczba obiektów: " + args[0]);


    }
}
