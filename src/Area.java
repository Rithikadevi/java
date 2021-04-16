import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gvie side of square");
        int side = sc.nextInt();
        areaOfSquare(side);

        System.out.println("Gvie len & bra of rectangle");
        int len = sc.nextInt();
        int bra = sc.nextInt();
        areaOfRectangle(len, bra);

        System.out.println("Gvie height & base of triangle");
        int height = sc.nextInt();
        int base = sc.nextInt();
        areaOfTriangle(height, base);

        System.out.println("Gvie radius of circle");
        int radius = sc.nextInt();
        areaOfCircle(radius);
    }

    public static void areaOfSquare(int side) {
        System.out.println("Area of square " + side * side);
    }

    public static void areaOfRectangle(int len, int bra) {
        System.out.println("Area of Rectangle " + len * bra);
    }

    public static void areaOfTriangle(int height, int base) {
        System.out.println("Area of Triangle " + (base * height) / 2);
    }

    public static void areaOfCircle(int radius) {
        System.out.println("Area of Circle " + (3.14 * radius * radius));
    }

}
