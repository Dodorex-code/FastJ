package Fast;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Fast
{
    public Fast()
    {
    }
    public static void print(String str)
    {
        System.out.println(str);
    }
    public static void delay(int dur) throws InterruptedException
    {
        TimeUnit.SECONDS.sleep(dur);

    }
    public static String input()
    {
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }
    public static void write_to_file(String filepath, String data) throws IOException
    {
        
        File file = new File(filepath);
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.write(data);
        pw.close();
        /**
        File destfile = new File(filepath);
        FileWriter fw = new FileWriter(destfile);
        PrintWriter pw = new PrintWriter(fw);
        */
    }
    public static String read_file(String filepath) throws FileNotFoundException
    {
        File file = new File(filepath);
        Scanner scn = new Scanner(file);
        String outp = "";
        while (scn.hasNextLine())
            outp = outp + scn.nextLine();
        return outp;
    }
    public static void clear_file(String filepath) throws IOException
    {
        write_to_file(filepath, "");
    }
}
