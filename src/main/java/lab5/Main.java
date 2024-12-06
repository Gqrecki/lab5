package lab5;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        ShapeDAO shapeDAO = new ShapeDAO(sessionFactory);

        Triangle triangle = new Triangle(3,4,5, new Color(1, 2, 3, 4));
        shapeDAO.saveShape(triangle);

        Rectangle rectangle = new Rectangle(5, 10, new Color(5, 6, 7, 8));
        shapeDAO.saveShape(rectangle);

        shapeDAO.getAllShapes().forEach((Shape s) -> {System.out.println(
                s.getClassName() + " ID=" + s.getId() + " - " + s + " - Color: " + s.getColorDescription()
        );});

        shapeDAO.close();
    }
}
