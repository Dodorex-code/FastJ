package FastMath;
import java.lang.Math;
public class MathJ
{
    public MathJ()
    {
    }
    public double dist2d(Vector2D a, Vector2D b)
    {
        return Math.sqrt(((b.x - a.x)*(b.x - a.x))+((b.x - a.x)*(b.x - a.x)));
    }
    public double dist3d(Vector3D a, Vector3D b)
    {
        return Math.sqrt(((b.x - a.x)*(b.x - a.x))+((b.x - a.x)*(b.x - a.x))+((b.z - a.z)*(b.z - a.z)));
    }
    public double dot2d(Vector2D a, Vector2D b)
    {
        return ((a.x*b.x)+(a.y*b.y));
    }
    public double dot3d(Vector3D a, Vector3D b)
    {
        return ((a.x*b.x)+(a.y*b.y)+(a.z*b.z));
    }
    public Vector3D cross3d(Vector3D a, Vector3D b)
    {
        return new Vector3D(((a.y*b.z)-(a.z*b.y)),((a.z*b.x)-(a.x*b.z)),((a.x*b.y)-(a.y*b.x)));
    }
    public double angle2d(Vector2D a, Vector2D b)
    {
        return (Math.pow(Math.cos((dot2d(a,b))/(a.magnitude()*b.magnitude())),-1))*(180/Math.PI);
    }
    public double angle3d(Vector3D a, Vector3D b)
    {
        return (Math.pow(Math.cos((dot3d(a,b))/(a.magnitude()*b.magnitude())),-1))*(180/Math.PI);
    }
}