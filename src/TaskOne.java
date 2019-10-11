
import java.util.Scanner;

public class TaskOne extends Thread{
    public void run(){
         for(int i=1;i<=10;i++){
            if(i==5){
                Scanner sc=new Scanner(System.in);
                sc.nextInt();
            }
            System.out.println("2 x "+i+" = "+(i*2));
        }
    }
}
