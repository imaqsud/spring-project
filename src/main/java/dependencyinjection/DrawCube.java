package dependencyinjection;

/**
 * Created by maiq on 20/09/17.
 */
public class DrawCube {

    public static void main(String[] args) {

        Cube cube = new Cube(2.5, 3.0, 1.4);

        System.out.println(cube.volume());
    }
}
