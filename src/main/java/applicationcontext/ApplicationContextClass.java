package applicationcontext;

import dependencyinjection.Triangle;
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
    public static void main(String[] args) {

        ApplicationContext applicationContex = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) applicationContex.getBean("triangle");
        triangle.draw();
        System.out.println(triangle.getType());
        System.out.println(triangle.getRollNo());
    }
}
