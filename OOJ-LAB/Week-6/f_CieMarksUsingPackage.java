package Lab_Programs;
import java.util.Scanner;

public class f_CieMarksUsingPackage{

    private static class Personal{
        private String Usn;
        private String Name;
        private int sem;

        Personal(String Usn, String Name, int sem){
            this.Usn = Usn;
            this.Name = Name;
            this.sem = sem;
        }
    }

    private static class Internals{
        private int[] marks = new int[5];

        public Internals(int[] marks){
            for(int i = 0; i < marks.length; i++)
                this.marks[i] = marks[i];
        }
    }

    private static class External extends Personal{
        private int[] seeMarks=new int[5];

        External(String Usn,String Name,int sem,int[] seeMarks){
            super(Usn,Name,sem);
            for(int i = 0; i < seeMarks.length; i++)
                this.seeMarks[i] = seeMarks[i];
        }
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter no. of students: ");
        int n = Sc.nextInt();

        Personal[] p = new Personal[n];
        int[] marks = new int[n];
        int[] seeMarks = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter USN, Name, Sem of "+(i+1)+" th student");
            String Usn = Sc.next();
            String Name = Sc.next();
            int sem = Sc.nextInt();

            int[] InternalMarks = new int[5];
            System.out.println("Enter marks of "+(i+1)+" th student ");
            for(int j = 0; j < 5; j++)
                InternalMarks[i] = Sc.nextInt();
            marks[i] = InternalMarks[i];

            int[] ExternalMarks = new int[5];
            System.out.println("Enter see marks of "+(i+1)+" th student ");
            for(int j = 0; j < 5; j++)
                ExternalMarks[i] = Sc.nextInt();
            seeMarks[i] = ExternalMarks[i];

            p[i] = new External(Usn,Name,sem,seeMarks);
        }

        System.out.println("Final Marks:");
        for(int i = 0; i < n; i++)
            System.out.println(p[i].Usn+" "+p[i].Name+" "+p[i].sem+" "+new Internals(marks).marks[i]+" "+new External(p[i].Usn,p[i].Name,p[i].sem,seeMarks).seeMarks[i]);
    }
}
