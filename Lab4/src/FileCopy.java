import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Brak argumentów programu.");
            return;
        }
        File in = new File(args[0]);
        if (in.isDirectory()){
            System.out.println(args[0]+ " jest katalogiem");
            return;
        }

        File out = new File(args[1]);


        FileChannel inChannel = new
                FileInputStream(in).getChannel();
        FileChannel outChannel = new
                FileOutputStream(out).getChannel();


        try {
            inChannel.transferTo(0, inChannel.size(),
                    outChannel);
        }
        catch (FileNotFoundException e){
            System.out.println("Z plikiem cos nie tak");
        }
        catch (IOException e) {
            System.out.println("Z plikiem cos nie tak");
        }

        finally {
            if (inChannel != null) inChannel.close();
            if (outChannel != null) outChannel.close();
        }


    }

}
