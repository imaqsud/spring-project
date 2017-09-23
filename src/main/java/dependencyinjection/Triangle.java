package dependencyinjection;

import java.util.List;

/**
 * Created by maiq on 19/09/17.
 */
public class Triangle implements Shape{

    private Point pointA;
    private Point pointB;
    private Point pointC;

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    private String type;
    private int rollNo;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

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

    public void printPoints(){

        System.out.println("(" + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("(" + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("(" + getPointC().getX() + ", " + getPointC().getY() + ")");
    }

    public void printPointList(){

        for (Point point : points) {
            System.out.println("(" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
