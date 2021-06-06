public class StaticAndNonStatic {
    static int length = 10;
    int breadth = 20;

    public static void main(String[] args) {
        StaticAndNonStatic sc = new StaticAndNonStatic();
        sc.AreaOfRectangle();
        PerimeterOfRectangle();
    }

    public static void PerimeterOfRectangle() {
        StaticAndNonStatic sc = new StaticAndNonStatic();
        int a = length;
        int b = sc.breadth;
        int perimeter = 2 * (a + b);
        System.out.println("Perimeter of Rectangle is " + perimeter);
    }

    public void AreaOfRectangle() {
        StaticAndNonStatic sc = new StaticAndNonStatic();
        int a = length;
        int b = sc.breadth;
        int area = a * b;
        System.out.println("Area of Rectangle is " + area);
    }
}
