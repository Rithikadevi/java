public class AreaPeriRectangle {
    static int length = 10;
    int breadth = 20;

    public static void main(String[] args) {
        AreaRectangle();
        AreaPeriRectangle sc = new AreaPeriRectangle();
        sc.PerimeterRectangle();

    }

    public static void AreaRectangle() {
        AreaPeriRectangle sc = new AreaPeriRectangle();
        int a = length;
        int b = sc.breadth;
        int area = a * b;
        System.out.println("Area of rectangle is " + area);
    }

    public void PerimeterRectangle() {
        AreaPeriRectangle sc = new AreaPeriRectangle();
        int a = length;
        int b = sc.breadth;
        int perimeter = 2 * (a + b);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }

}
