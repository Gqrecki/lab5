package lab5;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Shape {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Color color;

    public Shape() {}

    public Shape(Color c) {
        this.color = c;
    }

    public Long getId() {
        return id;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColorDescription() {
        return "R: " + color.getRed() + ", G: " + color.getGreen() + ", B: " + color.getBlue() + ", A: " + color.getAlpha();
    }

    public String getClassName() {
        return this.getClass().getSimpleName();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
