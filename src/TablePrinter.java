
import java.util.Scanner;

public class TablePrinter {
    
    
    //main-method is called as main-thread
    public static void main(String args[]){
        
        //task-1 (to print table of 2)
        for(int i=1;i<=10;i++){
            if(i==5){
                Scanner sc=new Scanner(System.in);
                sc.nextInt();
            }
            System.out.println("2 x "+i+" = "+(i*2));
        }
        
        //task-2 (to print table of 3)
        for(int i=1;i<=10;i++){
            System.out.println("3 x "+i+" = "+(i*3));
        }
    }
    
}
