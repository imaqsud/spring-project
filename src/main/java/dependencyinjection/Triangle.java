package dependencyinjection;

/**
 * Created by maiq on 19/09/17.
 */
public class Triangle implements Shape{

    private String type;
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    public Triangle(String type, int rollNo) {
        this.type = type;
        this.rollNo = rollNo;
    }

    public Triangle(){

    }
    public Triangle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /*public void setType(String type) {
        this.type = type;
    }*/

    public void draw() {
        System.out.println("Triangle");
    }
}
