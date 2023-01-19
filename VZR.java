import Fast.*;
import java.util.*;
import java.math.*;
public class VZR
{
    public VZR()
    {
    }
    public static boolean IstVZ(int n, int max)
    {
        int sum = 0;
        boolean erg = false;
        for(int i=1;i<max;i++)
        {
            if(n%i==0 && n%2==0)
            {
                sum+=i;
                if(sum>n)
                {
                    break;
                }
                if(n==sum)
                {
                    erg=true;
                    break;
                }
            }
        }
        return erg;
    }
    public static void VZIR(int end)
    {
        List<Integer> vzs = new ArrayList<Integer>();
        for(int j=2;j<end;j+=2)
        {
            boolean res = IstVZ(j,end);
            if(res==true)
            {
                System.out.print(Integer.toString(j)+" ");
                //vzs.add(j);
                res=false;
            }
            /*
            else
            {
                //System.out.print('\u000C');
                Fast.print("searching... [curently at "+j+" ]");
            }
            */
        }
        /*for(int i=0;i<vzs.size();i++)
        {
            System.out.print('\u000C');
            System.out.print(Integer.toString(vzs.get(i))+" ");
        }*/
    }
    public static void VZIR2(int end)
    {
        long sum=1,n,i;   //long um mit größeren zahlen arbeiten zu können
        List<Long> vzs = new ArrayList<Long>(); //Liste um VZs zu speichern
        for(n=1;n<end;n++) //geht jede zahl bis end durch
        {
            if(n%2==0) //ist n gerade => da alle VZs gerade
            {
                int sqrtn = (int)Math.sqrt(n); //wurzel vorberchnen um es nicht jede loop iteration machen zu müssen
                for(i=sqrtn;i>1;i--)  //zält runter von der wurzel von n bis 2
                {
                    if(n%i==0)
                    {
                        sum+=i+n/i; //Da wenn sqrtn unter .5 liegt abgerundet und über .5 aufgerundet wird, ist es so schneller |  z.B. um die VZ 6 zu finden, werden nur 2 statt 4 loop iterations gebraucht
                        if(sum>n) //sum ist größer als n
                        {
                            break;
                        }
                    }
                }
                if(sum==n && sum!=1) //sum (summe der teiler ist )
                {
                    vzs.add(n);
                }
                sum=1;  //reset sum für rechnen mit n+1
                System.out.print('\u000C'); //alles in der konsole löschen
                Fast.print("searching... [curently at "+n+" ]"); //"fortschritt" ausgeben
            }
        }
        System.out.print('\u000C'); //alles in der konsole löschen
        int vzs_size = vzs.size(); //size vorberchnen um es nicht jede loop iteration machen zu müssen
        for(int j=0;j<vzs_size;j++)
        {
            System.out.print(String.valueOf(vzs.get(j))+" "); //alle gefundeene VZs ausgeben
        }
        vzs.clear(); //liste mit VZs leeren
        System.gc(); //der Garbage Collection in der JVM höhere priorität geben => für liste benötigten speicher so bald wie möglich befreien
    }
}