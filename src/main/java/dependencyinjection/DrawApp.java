package dependencyinjection;

/**
 * Created by maiq on 23/09/17.
 */
public class DrawApp {

    public static void main(String[] args) {

        Draw draw = new Draw();

        Triangle triangle = new Triangle();
        Square square = new Square();

        draw.setShape(triangle);
        draw.drawShape();

        draw.setShape(square);
        draw.drawShape();
    }
}
