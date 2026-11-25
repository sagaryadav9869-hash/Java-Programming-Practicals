public class ATM {
    // Properties
    private double balance;
    private double minimumBalance;

    public ATM(double initialBalance, double minimumBalance) {
        this.balance = initialBalance;
        this.minimumBalance = minimumBalance;
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdrawMoney(double amount) {
        if (amount > 0 && (balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > 0) {
            System.out.println("Insufficient funds or amount exceeds minimum balance requirement.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Main method to test the ATM class
    public static void main(String[] args) {
        // Create an object of the ATM class
        ATM myATM = new ATM(5000, 1000);

        // Deposit money
        myATM.depositMoney(10000);

        // Withdraw money
        myATM.withdrawMoney(8000);

        // Print the final balance
        System.out.println("Final Balance: " + myATM.getBalance());
    }
}
