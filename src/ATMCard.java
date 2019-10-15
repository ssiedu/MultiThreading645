public class ATMCard extends Thread {
        private BankAccount account;
    
        public void run(){
            doWithdraw();
        }
        
        public void doWithdraw(){
            account.withdraw(8000);
        }
        
    public static void main(String args[]){
        ATMCard card1=new ATMCard();
        ATMCard card2=new ATMCard();
        ATMCard card3=new ATMCard();
        
        BankAccount ac1=new BankAccount(111,10000);
        BankAccount ac2=new BankAccount(112,20000);
        BankAccount ac3=new BankAccount(113,30000);
        
        card1.account=ac1;
        card2.account=ac2;
        card3.account=ac1;
        
        card1.start();
        card2.start();
        card3.start();
        
        
        
        
        
        
    }
}
