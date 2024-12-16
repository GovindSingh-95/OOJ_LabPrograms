package Lab_Programs;
import java.util.*;

public class J_DivisionOfTwoNumbers{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        try{
            System.out.print("Enter the first number: ");
            int a=Integer.parseInt(Sc.nextLine());
            System.out.print("Enter the second number: ");
            int b=Integer.parseInt(Sc.nextLine());

            if(b==0){
                throw new ArithmeticException("Cannot divide by zero");
            }else{
                System.out.println("The division of "+a+" and "+b+" is "+(a/b));
            }
        }
        catch(NumberFormatException e){
            System.out.println("Enter Integers only");
        }
        catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
