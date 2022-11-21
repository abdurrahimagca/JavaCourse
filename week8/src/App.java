public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Rectangle r = new Rectangle();
        r.getArea();
        r.getSides();
        Square s = new Square();
        s.getArea();
        Triangle t = new Triangle(5,6,7);
        t.getArea();
        t.getPerimeter(5,6,7);
    }
}
