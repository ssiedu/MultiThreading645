
import java.util.Scanner;


class Person{}

public class Emp extends Person implements Runnable {
    private int eno,salary;
    public Emp(int a, int b){
        eno=a; salary=b;
    }
    public void run(){
        calculate();
    }
    public void calculate(){
        System.out.println("HR of "+eno+" : "+(salary*20/100));
        if(eno==112){
            Scanner sc=new Scanner(System.in);
            sc.nextInt();
        }
        System.out.println("CA of "+eno+" : "+(salary*10/100));
        System.out.println("MA of "+eno+" : "+(salary*5/100));
    }
    
    public static void main(String args[]){
        
        Emp e1=new Emp(111,10000);
        Emp e2=new Emp(112,20000);
        Emp e3=new Emp(113,30000);
        Emp e4=new Emp(114,40000);
        
        Thread t1=new Thread(e1);
        Thread t2=new Thread(e2);
        Thread t3=new Thread(e3);
        Thread t4=new Thread(e4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        
       
    }
}
