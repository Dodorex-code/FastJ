package Fast;
import Fast.Fast;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class GUI
{
    public static JFrame jf_global = null;
    public static List<JLabel> labels_gl = new ArrayList<>();
    public GUI()
    {
    }
    public static void create_window()
    {
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf_global = jf;
    }
    public static void setup_window(String name, int width, int height, boolean resizable, boolean center_on_screen)
    {
        jf_global.setSize(width,height);
        jf_global.setTitle(name);
        jf_global.setResizable(resizable);
        jf_global.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if(center_on_screen)
        {
            jf_global.setLocationRelativeTo(null);
        }
    }
    public static void set_window_background_color(Color color)
    {
        jf_global.getContentPane().setBackground(color);
    }
    public static JLabel make_text(String text)
    {
        JLabel label = new JLabel(text);
        labels_gl.add(label);
        return label;
    }
    public static JLabel make_image(String ima)
    {
        JLabel label = new JLabel();
        label.setSize(99, 71);
        //create buffered image
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(ima));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //create scaled buffered image
        Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        //create Image icon from scaled buffered image
        ImageIcon imageIcon = new ImageIcon(dimg);
        
        label.setIcon(imageIcon);
        labels_gl.add(label);
        return label;
    }
    public static void add_labels()
    {
        for(JLabel i : labels_gl)
        {
            jf_global.add(i);
        }
    }
    public static JFrame get_window()
    {
        if(jf_global != null)
        {
            return jf_global;
        }
        else
        {
            Fast.print("ERROR: window accessed before assingment => returned null");
            return null;
        }
    }
    public static void animate(JLabel label, ImageIcon[] frames, boolean loops) throws InterruptedException
    {
        if(loops)
        {
            int counter = 0;
            while(loops)
            {
                label.setIcon(frames[counter]);
                Fast.delay(1);
                counter++;
                if(counter >= frames.length)
                {
                    counter = 0;
                }
                else
                {
                    counter++;
                }
            }
        }
        else
        {
            for(int i = 0; i < frames.length; i++)
            {
                label.setIcon(frames[i]);
                Fast.delay(1);
            }
        }
    }
}