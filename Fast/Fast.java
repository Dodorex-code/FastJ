package Fast;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

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
    public static class fmath
    {
        public static void Teiler(int n)
        {
            for(int i=1;i<=n;i++)
            {
                if(n%i==0){Fast.print(Integer.toString(i));}
            }
        }
        public static int AnzahlTeiler(int n)
        {
            int erg=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0){erg++;}
            }
            return erg;
        }
        public static boolean IstPrimzahl(int n)
        {
            if(AnzahlTeiler(n) == 2){return true;}
            else{return false;}
        }
        public static void PrimzahlenInRange(int start, int end)
        {
            Fast.print("Folgende Zahlen Zwischen "+start+" und "+end+" sind Primzahlen:");
            for(int i = start; i<=end;i++)
            {
                if(IstPrimzahl(i))
                {
                    Fast.print(Integer.toString(i));
                }
            }
        }
        public static double InvSqrt(int value)
        {
            return (Math.sqrt(value)) * -1;
        }
        public static double Dot2D(double x1, double y1, double x2, double y2)
        {
            return x1*x2+y1*y2;
        }
        public static double Mag2D(double x, double y) //vector laenge
        {
            return Math.sqrt(x*x+y*y);
        }
        public static double Mag3D(double x, double y, double z)//vector laenge
        {
            return Math.sqrt(x*x+y*y+z*z);
        }
        public static double Dot3D(double x1, double y1, double z1, double x2, double y2, double z2)
        {
            return x1*x2+y1*y2+z1*z2;
        }
        public static double Dist2D(double x1, double y1, double x2, double y2)
        {
            double dx,dy;
            if(x1>x2){dx=x1-x2;} else{dx=x2-x1;}
            if(y1>y2){dy=y1-y2;} else{dy=y2-y1;}
            return Math.sqrt(dx*dx+dy*dy);
        }
        public static double Dist3D(double x1, double y1, double z1, double x2, double y2, double z2)
        {
            double dx,dy,dz;
            if(x1>x2){dx=x1-x2;} else{dx=x2-x1;}
            if(y1>y2){dy=y1-y2;} else{dy=y2-y1;}
            if(z1>z2){dz=z1-z2;} else{dz=z2-z1;}
            return Math.sqrt(dx*dx+dy*dy+dz*dz);
        }
        public static double Angle2D(double x1, double y1, double x2, double y2)
        {
            /**
            double dotproduct = Dot2D(x1,y1,x2,y2);
            double LenV = y2;
            double LenU = Mag2D(x1,y1);
            double CosTh = dotproduct / (LenU*LenV);
            return Math.toDegrees(Math.acos(CosTh));
            */
            return Math.toDegrees(Math.acos(Dot2D(x1,y1,x2,y2)/(Mag2D(x1,y1)*y2)));
        }
    }
}