package FastMath;
import java.lang.Math;
public class Vector2D
{
    double x;
    double y;
    double length;
    public Vector2D(double vector3d_x, double vector3d_y)
    {
        x = vector3d_x;
        y = vector3d_y;
        length = Math.sqrt(((x*x)+(y*y)));
    }
    public double magnitude()
    {
        return Math.sqrt((x*x)+(y*y));
    }
}