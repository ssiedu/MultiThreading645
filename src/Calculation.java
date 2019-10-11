public class Calculation {
    
    public void square(int ar[]) throws Exception{
        for(int num:ar){
            System.out.println("Square of "+num+" : "+(num*num));
            Thread.sleep(150);
        }
    }
    public  void cube(int ar[]) throws Exception{
        for(int num:ar){
            System.out.println("Cube of "+num+" : "+(num*num*num));
            Thread.sleep(150);
        }
    }

    public static void main(String args[]) throws Exception{
        long v1=new java.util.Date().getTime();
        int n[]={1,2,3,4,5,6,7,8,9,10};
        Calculation ob1=new Calculation();
        Calculation ob2=new Calculation();
        ob1.square(n);
        ob2.cube(n);
        
        long v2=new java.util.Date().getTime();
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v2-v1);
    }
}
