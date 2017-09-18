package dependencyinjection;

/**
 * Created by maiq on 19/09/17.
 */
public class FactoryClass {

    /**
     * main method.
     * @param args
     */
    public static void main(String[] args) {

        Draw draw = new Draw();
        Triangle triangle = new Triangle();
        draw.setShape(triangle);
        draw.drawShape();

        Square square = new Square();
        draw.setShape(square);
        draw.drawShape();
    }
}
