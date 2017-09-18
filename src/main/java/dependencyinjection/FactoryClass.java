package dependencyinjection;

/**
 * Created by maiq on 19/09/17.
 */
public class FactoryClass {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Draw draw = new Draw();
        draw.setShape(triangle);
        draw.drawShape();
    }
}
