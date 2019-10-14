public class Calc{
    public static void main(String args[]){
        
        int ar[]={10,20,30,40,50};
        
        SquareCalculator ob1=new SquareCalculator(ar);
        CubeCalculator ob2=new CubeCalculator(ar);
        
        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);
        
        t1.start();
        t2.start();
        
        
    }
}

class SquareCalculator implements Runnable {
    int x[];

    public SquareCalculator(int[] x) {
        this.x = x;
    }
    public void run(){
        square();
    }
    
    public void square(){
        for(int n:x){
            System.out.println("Square of : "+n+" : "+(n*n));
        }
    }
}
class CubeCalculator implements Runnable{
    
    int x[];

    public CubeCalculator(int[] x) {
        this.x = x;
    }
    
    
    
    public void run(){
        cube();
    }
    public void cube(){
        for(int n:x){
            System.out.println("Cube of : "+n+" : "+(n*n*n));
        }
    }
}
