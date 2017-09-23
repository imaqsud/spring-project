package applicationcontext;

import dependencyinjection.Square;
import dependencyinjection.Triangle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maiq on 19/09/17.
 */
public class ApplicationContextClass {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws BeansException {

        ApplicationContext applicationContex = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) applicationContex.getBean("triangle");
        triangle.draw();
        System.out.println(triangle.getType());
        System.out.println(triangle.getRollNo());

        Square square = (Square) applicationContex.getBean("square");
        System.out.println(square.getRollNo());
        System.out.println(square.getName());

        square.draw();
    }
}
