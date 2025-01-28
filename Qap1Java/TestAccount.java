public class TestAccount {
    public static void main(String[] args) {
        // Create two accounts
        Account acc1 = new Account("A001", "John", 5000);
        Account acc2 = new Account("A002", "Jane", 4000);

        // Display initial balances
        System.out.println("Initial balance of Acc1: $" + acc1.getBalance());
        System.out.println("Initial balance of Acc2: $" + acc2.getBalance());

        // Transfer $1000 from Acc1 to Acc2
        acc1.transferTo(acc2, 1000);

        // Display balances after transfer
        System.out.println("Balance of Acc1 after transfer: $" + acc1.getBalance());
        System.out.println("Balance of Acc2 after transfer: $" + acc2.getBalance());
    }
}