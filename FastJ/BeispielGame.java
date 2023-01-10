import Fast.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class BeispielGame implements Runnable, KeyListener//klasse
{
    JLabel plb; //spieler sprite referenz
    int player_speed = 10; //geschwindigkeit
    public BeispielGame() throws InterruptedException
    {
        GUI.create_window();
        GUI.setup_window("Mein Window", 720, 480, false, true);
        JFrame window = GUI.get_window();
        GUI.set_window_background_color(Color.BLACK);
        window.addKeyListener(this);
        plb = GUI.make_image("D:/FastJ/SpaceShooterRedux/PNG/playerShip1_red.png");
        /**
         * EIN NOCH NICHT FERTIGES ANIMATIONS SYSTEM
        ImageIcon png1 = new ImageIcon("Police_animation/1.png");
        ImageIcon png2 = new ImageIcon("Police_animation/2.png");
        ImageIcon png3 = new ImageIcon("Police_animation/3.png");
        ImageIcon[] pngfr = {png1,png2,png3};
        GUI.animate(plb, pngfr, true); 
        
        */
        plb.setOpaque(true);
        GUI.add_labels();
        plb.setHorizontalAlignment(JLabel.CENTER);
        plb.setVerticalAlignment(JLabel.BOTTOM);
    }
    //input mit KeyListener
    @Override
    public void keyReleased(KeyEvent e)
    {
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case 37: plb.setLocation(plb.getX() - player_speed, plb.getY());
            break;
            case 39: plb.setLocation(plb.getX() + player_speed, plb.getY());
            break;
        }
    }
    @Override
    public void keyTyped(KeyEvent e)
    {
    }
    private boolean running;  //generierte variable. NICHT VERÄNDERN!
    private final double update_rate = 1.0d/60.0d;  //generierte variable. NICHT VERÄNDERN!
    public void update() //wird 60 mal pro sekunde aufgerufen. Hier werden sachen für die applikation berechnet.
    {
    }
    public void render() //wird 60 mal pro sekunde aufgerufen. Hier wird alles auf den bildschirm gerendert.
    {
    }
    @Override
    public void run() //NICHT VERÄNDERN! diese funktion sorgt dafür, dass die app 60 map rpo sekunde geupdated und neu gerendert wird.
    {
        running = true;
        double accumulator = 0d;
        long current_time, last_update = System.currentTimeMillis();
        while(running)
        {
            current_time = System.currentTimeMillis();
            double last_render_time_in_seconds = (current_time - last_update) / 1000d;
            accumulator += last_render_time_in_seconds;
            last_update = current_time;
            while(accumulator > update_rate)
            {
                update();
                accumulator -= update_rate;
                render();
            }
        }
    }
}