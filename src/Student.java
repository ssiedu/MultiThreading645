public class Student extends Thread {
    private int rno, m1,m2,m3;

    public void run(){
        result();
    }
    
    public void result(){
        int total=m1+m2+m3;
        int per=total/3;
        System.out.println("Total Marks For "+rno+" : "+total);
        if(per>=33){
            System.out.println("Result of "+rno+" : PASSED");
        }else{
            System.out.println("Result of "+rno+" : FAILED");
        }
        
        if(per>=70){
            System.out.println("GRADE of "+rno+" : A");
        }else if(per>60){
            System.out.println("GRADE of "+rno+" : B");
        }else{
            System.out.println("GRADE of "+rno+" : C");
        }
    }
    public Student(int rno, int m1, int m2, int m3) {
        this.rno = rno;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    
    
    
    public static void main(String args[]){
        
        Student s1=new Student(111,50,60,70);
        Student s2=new Student(112,30,40,50);
        Student s3=new Student(113,60,70,80);
        Student s4=new Student(114,35,25,20);
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
            
}
