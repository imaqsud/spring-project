package dependencyinjection;

/**
 * Created by maiq on 19/09/17.
 */
public class FactoryClass {

    public static void main(String[] args) {

        Draw draw = new Draw();
        Triangle triangle = new Triangle();
        draw.setShape(triangle);
        draw.drawShape();
    }
}
