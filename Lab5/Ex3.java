import java.util.ArrayList;
import java.util.Scanner;

// Parent class
abstract class Shape {
    abstract void draw();
}

// Line class
class Line extends Shape {
    int length;

    Line(int length) {
        this.length = length;
    }

    void draw() {
        System.out.println("length: " + length);
        for (int i = 0; i < length; i++) {
            System.out.print("_");
        }
        System.out.println();
    }
}

// Rectangle class
class Rectangle extends Shape {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void draw() {
        System.out.println("Width: " + width + ", Height: " + height);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// Triangle class
class Triangle extends Shape {
    int height;

    Triangle(int height) {
        this.height = height;
    }

    void draw() {
        System.out.println("Height: " + height);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Line> lines = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        ArrayList<Triangle> triangles = new ArrayList<>();

        while (true) {
            System.out.println("\n==== Menu ====");
            System.out.println("1. View all lines");
            System.out.println("2. View all rectangles");
            System.out.println("3. View all triangles");
            System.out.println("4. Add a new shape");
            System.out.println("5. Quit");
            System.out.print("Choose an opt: ");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("\n==== List all lines ====");
                    for (int i = 0; i < lines.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        lines.get(i).draw();
                    }
                    break;

                case 2:
                    System.out.println("\n==== List all rectangles ====");
                    for (int i = 0; i < rectangles.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        rectangles.get(i).draw();
                    }
                    break;

                case 3:
                    System.out.println("\n==== List all triangles ====");
                    for (int i = 0; i < triangles.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        triangles.get(i).draw();
                    }
                    break;

                case 4:
                    System.out.println("\n==== Add new shape ====");
                    System.out.println("1. Line");
                    System.out.println("2. Rectangle");
                    System.out.println("3. Triangle");
                    System.out.print("Choose an opt: ");

                    int shape = sc.nextInt();

                    if (shape == 1) {
                        System.out.print("Input length: ");
                        int len = sc.nextInt();
                        lines.add(new Line(len));
                    }

                    else if (shape == 2) {
                        System.out.print("Input width: ");
                        int w = sc.nextInt();
                        System.out.print("Input height: ");
                        int h = sc.nextInt();
                        rectangles.add(new Rectangle(w, h));
                    }

                    else if (shape == 3) {
                        System.out.print("Input height: ");
                        int h = sc.nextInt();
                        triangles.add(new Triangle(h));
                    }

                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}