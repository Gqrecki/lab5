package lab5;

import jakarta.persistence.*;

@Entity
@Table(name = "rectangles")
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "W: " + this.width + " H: " + this.height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
