public class shape {
    public static int area;
    public shape() {
    }


    public static int perimeter;
 
    
    public shape() {
    }


    static class twoDimensionalShape extends shape{
        
        static class circle extends twoDimensionalShape{
            public int radius;
          
            public circle(int radius, int area, int perimeter) {
                super(radius,area,perimeter);   
                this.radius = radius;
            }
           
            public static void circleArea(int radius, double PI){
                System.out.println(2*((double) radius*radius*PI));
                
            }
            

        }
        static class rectengular extends twoDimensionalShape{
            public int edge;
            public rectengular(int edge, int edge2) {
                this.edge = edge;
                this.edge2 = edge2;
            }
            public int edge2;
        }
        static class triange extends twoDimensionalShape{
            public int type;
            public int edge1;
            public int edge2;
            public int edge3;
            public triange(int type, int edge1, int edge2, int edge3) {
                this.type = type;
                this.edge1 = edge1;
                this.edge2 = edge2;
                this.edge3 = edge3;
            }


        }
        
    }


    


}
