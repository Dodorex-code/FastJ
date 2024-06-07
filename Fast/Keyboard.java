package Fast;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;

public class Keyboard extends JFrame implements KeyListener
{
    private ArrayList<String> keysPressed = new ArrayList<String>();
    public Keyboard()
    {
    }
    public void keyTyped(KeyEvent e)
    {
        
    }
    public void keyPressed(KeyEvent e)
    {
        if(keysPressed.contains(e.getKeyText(e.getKeyCode()).toLowerCase()) == false)
        {
            keysPressed.add(e.getKeyText(e.getKeyCode()).toLowerCase());
        }
    }
    public void keyReleased(KeyEvent e)
    {
        if(keysPressed.contains(e.getKeyText(e.getKeyCode()).toLowerCase()) == true)
        {
            keysPressed.remove(e.getKeyText(e.getKeyCode()).toLowerCase());
        }
    }
    public boolean isKeyPressed(String key)
    {
        return keysPressed.contains(key.toLowerCase());
    }
    public ArrayList<String> getKeysPressed()
    {
        return keysPressed;
    }
}