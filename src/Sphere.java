import static java.lang.Math.*;

public class Sphere implements $3D_Shape {
    private float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    @Override
    public float getVolume() {
        return (float) (((float) 4 / (float) 3) * PI * pow(radius, 3));
    }

    @Override
    public float getSurfaceArea() {
        return (float) (4 * PI * pow(radius, 2));
    }

    @Override
    public String volumeExplain() {
        final String message;
        message = "(4/3) x π x  " + String.format("%.2f", radius) + "^3 = " + String.format("%.2f", getVolume());
        return message;
    }

    @Override
    public String surfaceAreaExplain() {
        final String message;
        message = "4 x π x  " + radius + "^2 = " + getSurfaceArea();
        return message;
    }
}
