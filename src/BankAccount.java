public class BankAccount {
    
    private int ano, balance;
    
    
    public synchronized void withdraw(int amount){
        
        StringBuffer sb1;
        StringBuilder sb2;
        if(balance>=amount){
            System.out.println("Transaction Allowed For "+ano);
            System.out.println("Collect Cash "+amount+" From "+ano);
            balance=balance-amount;
            System.out.println("Remaining Balance In "+ano+" : "+balance);
        }else{
            System.out.println("Insufficient Balance In "+ano);
        }
    }
    
    public BankAccount(int a, int b){
        ano=a; balance=b;
    }
    
}
