package FastMath;
import java.lang.Math;
public class Vector3D
{
    double x;
    double y;
    double z;
    double length;
    public Vector3D(double vector3d_x, double vector3d_y, double vector3d_z)
    {
        x = vector3d_x;
        y = vector3d_y;
        z = vector3d_z;
        length = Math.sqrt(((x*x)+(y*y)+(z*z)));
    }
    public double magnitude()
    {
        return Math.sqrt((x*x)+(y*y)+(z*z));
    }
}
