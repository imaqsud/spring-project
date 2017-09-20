package dependencyinjection;

/**
 * Created by maiq on 20/09/17.
 */
public class Cube {

    private Double length;
    private Double width;
    private Double height;

    public Cube(){

    }

    public Cube(Double length, Double width, Double height){

        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double volume(){

        return length*width*height;
    }
}
