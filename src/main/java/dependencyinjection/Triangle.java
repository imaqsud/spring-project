package dependencyinjection;

/**
 * Created by maiq on 19/09/17.
 */
public class Triangle implements Shape{

    private String type;
    private int rollNo;

    public Triangle(){

    }

    public Triangle(String type, int rollNo){

        this.type = type;
        this.rollNo = rollNo;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getType() {
        return type;
    }

    public void draw() {
        System.out.println("Triangle");
    }
}
