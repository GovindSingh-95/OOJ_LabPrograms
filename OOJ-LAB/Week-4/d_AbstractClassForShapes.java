package Lab_Programs;

public class d_AbstractClassForShapes{

    private static abstract class Shape{
        double a,b;

        Shape(double a, double b){
            this.a = a;
            this.b = b;
        }

        abstract void area();
    }

    private static class Rectangle extends Shape{
        Rectangle(double a, double b){
            super(a,b);
        }

        @Override
        void area(){
            System.out.println("Area of Rectangle is: "+a*b);
        }
    }

    private static class Circle extends Shape{
        Circle(double a){
            super(a,0);
        }

        @Override
        void area(){
            System.out.println("Area of Circle is: "+3.14*a*a);
        }
    }

    private static class Triangle extends Shape{
        Triangle(double a, double b){
            super(a,b);
        }

        @Override
        void area(){
            System.out.println("Area of Triangle is: "+0.5*a*b);
        }
    }

    public static void main(String[] args) {
        Rectangle r=new Rectangle(2,3);
        Circle c=new Circle(4);
        Triangle t=new Triangle(5,6);
        r.area();
        c.area();
        t.area();
    }
}
