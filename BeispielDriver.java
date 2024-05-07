import Fast.*; //alles aus dem Fast packet (Fast, GUI, Play) wird importiert
public class BeispielDriver //klasse
{
    public BeispielDriver() throws InterruptedException
    {
        // Play.generate_glc_in_editor("BeispielGame", "60"); wurde genutzt um den code fuer die Klasse BeispieGame zu generieren. Die klasse "läuft" mit 60 fps.
        new Thread(new BeispielGame()).start(); //hiermit wird die BeispielGame klasse und damit das eigentliche spiel gestartet.
    }
    public static void run() throws InterruptedException
    {
        new Thread(new BeispielGame()).start();
    }
}
