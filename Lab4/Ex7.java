

class Point {
    float x, y;

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Position => X: " + x + ", Y: " + y);
    }
}

class Line extends Point {
    int length;

    Line(float x, float y, int length) {
        super(x, y);
        this.length = length;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Line  => Length: " + length);
    }
}

class Triangle extends Line {
    String name;

    Triangle(float x, float y, int length, String name) {
        super(x, y, length);
        this.name = name;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Triangle => Name: " + name
                + ", Perimeter: " + (length * 3));
    }
}

class Rectangle extends Triangle {
    String color;

    Rectangle(float x, float y, int length, String name, String color) {
        super(x, y, length, name);
        this.color = color;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Rectangle => Color: " + color
                + ", Area: " + (length * length)
                + ", Perimeter: " + (length * 4));
    }
}

public class Ex7 {
    public static void main(String[] args) {

        System.out.println("===== Point =====");
        Point p = new Point(2.5f, 3.0f);
        p.display();

        System.out.println("\n===== Line =====");
        Line l = new Line(1.0f, 1.0f, 10);
        l.display();

        System.out.println("\n===== Triangle =====");
        Triangle t = new Triangle(0f, 0f, 5, "Triangle");
        t.display();
        
        System.out.println();
        System.out.println("Add new line.");

        System.out.println("\n===== Rectangle =====");
        Rectangle r = new Rectangle(4.0f, 6.0f, 8, "Square", "Blue");
        r.display();
    }
}