package Lab_Programs;

public class I_TwoThreadsClash{

    private static class thread_1 extends Thread{
        @Override
        public void run(){
            while(true){
                System.out.println("BMS College of Engineering");
                try{
                    Thread.sleep(10000);
                }
                catch (InterruptedException e){
                    System.out.println("Thread1 got Interrupted");
                }
            }
        }
    }

    private static class thread_2 extends Thread{
        @Override
        public void run(){
            while(true){
                System.out.println("CSE");
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    System.out.println("Thread2 got Interrupted");
                }
            }
        }
    }

    public static void main(String[] args){
        thread_1 t1 = new thread_1();
        thread_2 t2 = new thread_2();
        t1.start();
        t2.start();
    }
}

