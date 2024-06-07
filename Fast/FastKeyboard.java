package Fast;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;

public class FastKeyboard extends JFrame implements KeyListener
{
    private ArrayList<String> keysPressed = new ArrayList<String>();
    public FastKeyboard()
    {
    }
    public void keyTyped(KeyEvent e)
    {
        
    }
    public void keyPressed(KeyEvent e)
    {
        keysPressed.add(e.toString().toLowerCase());
    }
    public void keyReleased(KeyEvent e)
    {
        keysPressed.remove(e.toString().toLowerCase());
    }
    public boolean isKeyPressed(String key)
    {
        return keysPressed.contains(key.toLowerCase());
    }
}