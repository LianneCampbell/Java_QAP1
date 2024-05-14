public class TestAccount {
    public static void main(String[] args) {
        // Creating two accounts
        Account acc1 = new Account("001", "Acc1", 5000);
        Account acc2 = new Account("002", "Acc2", 4000);

        // Displaying balance of both accounts
        System.out.println("\nCurrent Balance:");
        System.out.println("Balance of Acc1: $" + acc1.getBalance());
        System.out.println("Balance of Acc2: $" + acc2.getBalance());

        // Transferring $1000.00 from account 1 to account 2
        acc1.transferTo(acc2, 1000);

        // Displaying balance of both accounts again
        System.out.println("\nAfter transfer:");
        System.out.println("Balance of Acc1: $" + acc1.getBalance());
        System.out.println("Balance of Acc2: $" + acc2.getBalance());
    }
}