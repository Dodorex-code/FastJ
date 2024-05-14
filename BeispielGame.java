import Fast.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class BeispielGame implements Runnable, KeyListener//klasse
{
    JLabel plb; //spieler sprite referenz
    int player_speed = 10; //geschwindigkeit
    int plb_scale = 2;
    ImageIcon[] plb_frames;
    int plb_frames_counter = 0;
    int[] move_buffer = {0,0,0,0};
    public BeispielGame() throws InterruptedException
    {
        GUI.create_window();
        GUI.setup_window("Mein Window", 720, 480, false, true);
        JFrame window = GUI.get_window();
        //GUI.set_window_background_color(Color.WHITE);
        window.addKeyListener(this);
        plb = GUI.make_image("Police.png",256/plb_scale,256/plb_scale);
        plb.setOpaque(true);
        GUI.add_labels();
        plb.setHorizontalAlignment(JLabel.CENTER);
        plb.setVerticalAlignment(JLabel.BOTTOM);
        plb_frames = GUI.create_frame_sequence("./resw/skeleton-move_", 17, ".png", 288, 311);
        GUI.registerAnimation(plb, plb_frames);
    }
    //input mit KeyListener
    @Override
    public void keyReleased(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case 37: move_buffer[0] = 0;
            break;
            case 39: move_buffer[1] = 0;
            break;
            case 38: move_buffer[2] = 0;
            break;
            case 40: move_buffer[3] = 0;
            break;
        }
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case 37: move_buffer[0] = 1;
            break;
            case 39: move_buffer[1] = 1;
            break;
            case 38: move_buffer[2] = 1;
            break;
            case 40: move_buffer[3] = 1;
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
        
        if(move_buffer[0] == 1) //W
        {
            plb.setLocation(plb.getX() - player_speed, plb.getY());
        }
        if(move_buffer[1] == 1) //S
        {
            plb.setLocation(plb.getX() + player_speed, plb.getY());
        }
        if(move_buffer[2] == 1) //A
        {
            plb.setLocation(plb.getX(), plb.getY() - player_speed);
        }
        if(move_buffer[3] == 1) //D
        {
            plb.setLocation(plb.getX(), plb.getY() + player_speed);
        }
        
        GUI.animate();
    }
    public void render() //wird 60 mal pro sekunde aufgerufen. Hier wird alles auf den bildschirm gerendert.
    {
    }
    @Override
    public void run() //NICHT VERÄNDERN! diese funktion sorgt dafür, dass die app 60 mal pro sekunde geupdated und neu gerendert wird.
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