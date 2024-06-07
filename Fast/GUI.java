package Fast;
import Fast.Fast;
import FastMath.MathJ;
import FastMath.Vector2D;
import FastMath.Vector3D;
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
    public static List<JLabel> animated_labels_gl = new ArrayList<JLabel>();
    public static List<ImageIcon[]> animated_labels_frame_sequences_gl = new ArrayList<ImageIcon[]>();
    // bei animated_labels_frame_sequences_counter_gl ist [0] der eigentlicher counter und [1] die maximale frame anzahl
    public static List<Integer[]> animated_labels_frame_sequences_counter_gl = new ArrayList<Integer[]>();
    public static int animation_read_buffer = 0;
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
    public static JLabel make_image(String ima, int width, int height)
    {
        JLabel label = new JLabel();
        label.setSize(width, height);
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
    public static ImageIcon[] create_frame_sequence(String prefix, int count, String suffix, int width, int height)
    {
        ImageIcon[] frame_sequence = new ImageIcon[count];
        for(int i=0;i<count;i++)
        {
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(prefix+i+suffix));
            } catch (IOException e) {
                e.printStackTrace();
            }
            //create scaled buffered image
            Image dimg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            //create Image icon from scaled buffered image
            ImageIcon imageIcon = new ImageIcon(dimg);
            frame_sequence[i] = imageIcon;
        }
        return frame_sequence;
    }
    public static void registerAnimation(JLabel image, ImageIcon[] frame_sequence)
    {
        animated_labels_gl.add(image);
        animated_labels_frame_sequences_gl.add(frame_sequence);
        Integer[] arr = {0, frame_sequence.length};
        animated_labels_frame_sequences_counter_gl.add(arr);
    }
    public static void animate()
    {
        int i = 0;
        int current_frame_counter = animated_labels_frame_sequences_counter_gl.get(i)[0];
        ImageIcon current_frame = animated_labels_frame_sequences_gl.get(i)[current_frame_counter];
        animated_labels_gl.get(i).setIcon(current_frame);
        // dec counter
        Integer[] new_arr = {current_frame_counter+1, animated_labels_frame_sequences_counter_gl.get(i)[1]};
        animated_labels_frame_sequences_counter_gl.set(i, new_arr);
        if(new_arr[0] > animated_labels_frame_sequences_counter_gl.get(i)[1]-1)
        {
            Integer[] new_arr_2 = {0, animated_labels_frame_sequences_counter_gl.get(i)[1]};
            animated_labels_frame_sequences_counter_gl.set(i, new_arr_2);
        }
    }
    public boolean is_image_intersecting_other_image(int image_width, int image_height, int image_x_position, int image_y_position, int other_image_width, int other_image_height, int other_image_x_position, int other_image_y_position)
    {
        int tw = image_width;
        int th = image_height;
        int rw = other_image_width;
        int rh = other_image_height;
        if(rw <= 0 || rh <= 0 || tw<= 0 || th <= 0)
        {
            return false;
        }
        int tx = image_x_position;
        int ty = image_y_position;
        int rx = other_image_x_position;
        int ry = other_image_y_position;
        rw += rx;
        rh+= ry;
        tw += tx;
        th += ty;
        //      overflow || intersect
        return ((rw < rx || rw > tx) &&
                (rh < ry || rh > ty) &&
                (tw < tx || tw > rx) &&
                (th < ty || th > ry));
    }
    public static void addKeyboard(Keyboard kboard)
    {
        jf_global.addKeyListener(kboard);
    }
}