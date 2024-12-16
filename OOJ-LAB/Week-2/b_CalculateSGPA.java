package Lab_Programs;
import java.util.Scanner;

public class b_CalculateSGPA{
    private static class Student{
        private String USN;
        private String Name;
        int[] credits;
        int[] marks;

        private void Details(){

            Scanner Sc = new Scanner(System.in);

            System.out.print("Enter USN: ");
            USN = Sc.nextLine();
            System.out.print("Enter Name: ");
            Name = Sc.nextLine();
            System.out.print("Enter number of subjects: ");
            int n = Sc.nextInt();

            credits = new int[n];
            marks = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter credits for subject " + (i + 1) + ": ");
                credits[i] = Sc.nextInt();
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = Sc.nextInt();
            }
        }
        private void Display(){
            System.out.println("USN: "+USN);
            System.out.println("Name: "+Name);
            for(int i=0;i< credits.length;i++){
                System.out.println("Credits for subject "+(i+1)+" is "+credits[i]);
                System.out.println("Marks for subject "+(i+1)+" is "+marks[i]);
                }
            }

        private double calculateSGPA(){
            int totalCredits = 0;
            double weightedSum = 0.0;

            for (int i = 0; i < credits.length; i++) {
                totalCredits += credits[i];
                int gradePoint = getGradePoint(marks[i]);
                weightedSum += gradePoint * credits[i];
            }

            return weightedSum / totalCredits;
        }

        private int getGradePoint(int marks){
           if (marks >= 90) return 10;
           else if (marks >= 80) return 9;
           else if (marks >= 70) return 8;
           else if (marks >= 60) return 7;
           else if (marks >= 50) return 6;
           else if (marks >= 40) return 5;
           else return 0;
        }
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.Details();
        s.Display();

        double SGPA = s.calculateSGPA();
        System.out.println("SGPA is "+SGPA);
    }
}

