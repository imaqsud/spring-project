package beanfactory;

import dependencyinjection.Square;
import dependencyinjection.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by maiq on 19/09/17.
 */
public class BeanFactoryClass {

    public static void main(String[] args) {

        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
        triangle.draw();

        Square square = (Square) beanFactory.getBean("square");
        square.draw();
    }
}