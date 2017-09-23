package dependencyinjection;

/**
 * Created by maiq on 19/09/17.
 */
public class Square implements Shape {

    private int rollNo;
    private String name;

    public Square(){

    }

    public Square(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public void draw() {
        System.out.println("Square");
    }
}
