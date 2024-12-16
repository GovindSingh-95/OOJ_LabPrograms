package Lab_Programs;
import java.util.*;
import java.text.*;

public class a_QuadraticEquation{
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("#.##");
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter Coefficient of X^2: ");
        double a=Sc.nextInt();
        System.out.print("Enter Coefficient of X: ");
        double b=Sc.nextInt();
        System.out.print("Enter Constant term: ");
        double c=Sc.nextDouble();
        double D=Math.pow(b,2)-4*a*c;
        if(D>=0){
            double r1=(-b+Math.sqrt(D))/(2*a);
            double r2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("The Roots are real:\n"+df.format(r1)+"\n"+df.format(r2));
        }
        else{
            D*=-1;
            double rel=(-b/(2*a));
            double img=(Math.sqrt(D)/(2*a));
            System.out.println("The Roots are imaginary and conjugated:");
            System.out.println(df.format(rel)+"+"+df.format(img)+"i");
            System.out.print(df.format(rel)+"-"+df.format(img)+"i");
        }
    }
}
