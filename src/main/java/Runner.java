public class Runner {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Isabel", "Martinez", "2 April 1992", 1234567890);
        // BankAccount account2 = new BankAccount("John", "Smith", "1 January 2000", 56789);

            System.out.println("Account holder name: " + account1.firstName + " " + account1.lastName);
            System.out.println("Date of birth: " + account1.dateOfBirth);
            System.out.println("Account number: " + account1.accountNumber);
            System.out.println("Current balance: " + account1.balance);

            account1.deposit(5000);
            account1.withdrawal(1000);

            int deposit = account1.deposit();
            System.out.println(deposit);

        }
    }