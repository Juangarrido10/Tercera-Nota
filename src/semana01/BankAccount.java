package semana01;
public class BankAccount {
    public static class BankAccountt{
        String accountNumber;
        String owner; 
        double balance;
    
        //metodos
        void deposit ( double amount){
            balance += amount; 
            System.out.println("Deposito: " + amount + " nuevo balance " + balance);
        }
    
        void withdraw(double amount){
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Retiro: " + amount + "ahora el balance es: " + balance);
            } else{
                System.out.println("No tiene fondos suficientes ");
            }
        }
    
        void showBalance(){
            System.out.println("Su balance es: " + balance);
        }
    
    
        }
        public static void main(String[] args) throws Exception {
            BankAccountt account1 = new BankAccountt();
            account1.accountNumber = "555-555-555";
            account1.balance = 2000000;
            account1.owner = "Juan";
            System.out.println(account1.balance);
    
            account1.showBalance();
            account1.deposit(5000000);
            account1.withdraw(1000000);
    
            System.out.println("Número de cuenta: #" + account1.accountNumber  );
            System.out.println("Balance: " + account1.balance);
            System.out.println("Nombre: " + account1.owner);
    
        }
}
