package dependencyinjection;

/**
 * Created by maiq on 20/09/17.
 */
public class DrawCircle {

    public static void main(String[] args) {

        Circle circle = new Circle(8.0);
        System.out.println(circle.area());
    }
}
