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
        if(keysPressed.contains(e.getKeyChar()) == false)
        {
            keysPressed.add(e.getKeyText(e.getKeyCode()));
        }
    }
    public void keyReleased(KeyEvent e)
    {
        if(keysPressed.contains(e.getKeyChar()) == true)
        {
            keysPressed.remove(e.getKeyText(e.getKeyCode()));
        }
    }
    public boolean isKeyPressed(String key)
    {
        return keysPressed.contains(key);
    }
}