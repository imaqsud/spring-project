package dependencyinjection;

/**
 * Created by maiq on 19/09/17.
 */
public class Draw {

    private Shape shape;

    /**
     *
     * @param shape
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }
    public void drawShape(){
        this.shape.draw();
    }
}
