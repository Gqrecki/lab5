package lab5;

import jakarta.persistence.Embeddable;

@Embeddable
public class Color {
    private int red;
    private int green;
    private int blue;
    private int alpha;

    public Color() {}

    public Color(int r, int g, int b, int a) {
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255 || a < 0 || a > 255) {
            throw new IllegalArgumentException("0-255");
        }
        this.red = r;
        this.green = g;
        this.blue = b;
        this.alpha = a;
    }

    public Color(int r, int g, int b) {
        this(r, g, b, 0);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int r) {
        this.red = r;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int g) {
        this.green = g;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int b) {
        this.blue = b;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int a) {
        this.alpha = a;
    }
}
