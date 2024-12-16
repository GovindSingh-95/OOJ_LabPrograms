package Lab_Programs;

import java.util.Scanner;

public class h_FatherSonAge{

    private static class WrongException extends Exception{
        WrongException(String message){
            super(message);
        }
    }

    private static class Father{
        int age;
        Father(int age){
            this.age = age;
        }
    }

    private static class Son extends Father{
        int SonAge;
        Son(int age, int SonAge){
            super(age);
            if(SonAge <0)
                throw new WrongThreadException("Age cannot be -ve");
            else if(SonAge > age)
                throw new WrongThreadException("Son's age cannot be greater than father's age");
            this.SonAge = SonAge;
        }
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter father's age: ");
        int Father_Age=Sc.nextInt();
        System.out.println("Enter son's age: ");
        int Son_Age=Sc.nextInt();

        Son s=new Son(Father_Age,Son_Age);
        System.out.println("Son's age is "+s.SonAge);
        System.out.println("Father's age is "+s.age);
    }
}
