public class TaskTwo extends Thread {
    public void run(){
         for(int i=1;i<=10;i++){
            System.out.println("3 x "+i+" = "+(i*3));
        }
    }
}
