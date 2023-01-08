package Fast;
import Fast.Fast;

public class Play
{
    public Play()
    {
    }
    public static void generate_glc_in_editor(String class_name, String fps)
    {
        Fast.print("public class "+class_name+" implements Runnable");
        Fast.print("{");
        Fast.print("    public "+class_name+ "()");
        Fast.print("    {");
        Fast.print("    }");
        Fast.print("    private boolean running;");
        Fast.print("    private final double update_rate = 1.0d/"+fps+".0d;");
        Fast.print("    public void update()");
        Fast.print("    {");
        Fast.print("    }");
        Fast.print("    public void render()");
        Fast.print("    {");
        Fast.print("    }");
        Fast.print("    @Override");
        Fast.print("    public void run()");
        Fast.print("    {");
        Fast.print("        running = true;");
        Fast.print("        double accumulator = 0d;");
        Fast.print("        long current_time, last_update = System.currentTimeMillis();");
        Fast.print("        while(running)");
        Fast.print("        {");
        Fast.print("            current_time = System.currentTimeMillis();");
        Fast.print("            double last_render_time_in_seconds = (current_time - last_update) / 1000d;");
        Fast.print("            accumulator += last_render_time_in_seconds;");
        Fast.print("            last_update = current_time;");
        Fast.print("            while(accumulator > update_rate)");
        Fast.print("            {");
        Fast.print("                update();");
        Fast.print("                accumulator -= update_rate;");
        Fast.print("                render();");
        Fast.print("            }");
        Fast.print("        }");
        Fast.print("    }");
        Fast.print("}");
        Fast.print("PASTE THE CODE BELOW INTO THE METHODE OF YOUR DRIVER CLASS WHICH YOU USE TO START THE APPLICATION");
        Fast.print("new Thread(new "+class_name+"()).start();");
    }
}