package Lab_Programs;
import java.util.Scanner;

public class c_BookStore{

    private static class Book{
        private String name;
        private String author;
        private int price;
        private int pageNumber;

        Book(String name, String author, int price, int pageNumber){
            this.name=name;
            this.author=author;
            this.price=price;
            this.pageNumber=pageNumber;
        }

        private void setName(String name){
            this.name=name;
        }
        private void setAuthor(String author){
            this.author=author;
        }
        private void setPrice(int price){
            this.price=price;
        }
        private void setPageNumber(int pageNumber){
            this.pageNumber=pageNumber;
        }


        private String getName(){
            return name;
        }
        private String getAuthor(){
            return author;
        }
        private int getPrice(){
            return price;
        }
        private int getPageNumber(){
            return pageNumber;
        }


        @Override
        public String toString(){
            return "Name: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\nPage Number: "+pageNumber;
        }
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        Book B =new Book("","",0,0);
        System.out.print("Enter number of the book: ");
        int n=Sc.nextInt();

        for(int i=1;i<=n;i++){
            Scanner Sc1=new Scanner(System.in);
            System.out.print("\nEnter name: ");
            String name=Sc1.nextLine();
            System.out.print("Enter author: ");
            String author=Sc1.nextLine();
            System.out.print("Enter price: ");
            int price=Sc1.nextInt();
            System.out.print("Enter page number: ");
            int pageNumber=Sc1.nextInt();

            B=new Book(name,author,price,pageNumber);
            System.out.println(B.toString());
        }
        Sc.close();
    }
}
