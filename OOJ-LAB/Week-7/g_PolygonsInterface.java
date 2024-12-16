package Lab_Programs;

public class g_PolygonsInterface{

    private interface Polygons{

        default double getPerimeter(double... sides){
            double perimeter=0;
            for(double side:sides){
                perimeter+=side;
            }
            return perimeter;
        }

        double getArea();
    }

    private static class Rectangle implements Polygons{
        private double length, breadth;

        public Rectangle(double length, double breadth){
            this.length=length;
            this.breadth=breadth;
        }

        @Override
        public double getArea(){
            return length*breadth;
        }
    }

    private static class Triangle implements Polygons{
        private double base, height,length;

        public Triangle(double base, double height,double length){
            this.base=base;
            this.height=height;
            this.length=length;
        }
        @Override
        public double getArea(){
            return (base*height)/2;
        }
    }

    public static void main(String[] args){
        Rectangle r1=new Rectangle(10,20);
        Triangle t1=new Triangle(10,20,10);
        System.out.println("The dimensions of the Rectangle are: "+r1.length+" and "+r1.breadth);
        System.out.println("Perimeter of Rectangle is "+r1.getPerimeter(10,20));
        System.out.println("Area of Rectangle is "+r1.getArea()+"\n");

        System.out.println("The dimensions of the Triangle are: "+t1.base+" and "+t1.height+" and "+t1.length);
        System.out.println("Perimeter of Triangle is "+t1.getPerimeter(10,20,10));
        System.out.println("Area of Triangle is "+t1.getArea());
    }
}
