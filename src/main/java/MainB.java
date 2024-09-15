public class Main {

	public static void main(String[] args) {
		BankAccount lisa = new BankAccount(1000, -1000, "Lisa");
        BankAccount bob = new BankAccount(1000, -1000, "Bob");
//		System.out.println(acct1.getBalance());
		
//		acct2.withdraw(5000);
//		System.out.println(acct1.getBalance());
//		acct1.deposit(300);
//		System.out.println(acct1.getBalance());
//		
//		boolean success = acct1.transfer(acct2, 500);
//	    System.out.println("transfer success = " + success);
//		System.out.println(acct1.getBalance());
//		System.out.println(acct2.getBalance());

//      System.out.println(acct1);

        System.out.println(lisa);
        System.out.println(bob);
        
        lisa.transfer(bob, 500);
        
        System.out.println(lisa);
        System.out.println(bob);
        
        boolean transfer= lisa.transfer(bob, 1600);
        
        if(transfer==false) {
        	System.out.println("Not enough money in account");
        }
	}
}
