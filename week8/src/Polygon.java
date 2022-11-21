public interface Polygon {
    void getArea();
    default void getPerimeter(int... sides){
        int perimeter = 0;
        for(int side:sides){
            perimeter += side;
        }
        System.out.println("cevre : " + perimeter);
    }
}
