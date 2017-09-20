package dependencyinjection;

/**
 * Created by maiq on 20/09/17.
 */
public class Circle {

    private Double radius;

    public Circle(){

    }

    public Circle(Double radius){

        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}