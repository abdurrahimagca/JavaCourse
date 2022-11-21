public class Triangle implements Polygon{
    private int a,b,c;
    public int getA() {
        return a;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    private double s,area;

    public void getArea(){
        s = (double) (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("triangle's area is  " + area);
    }
    
}
