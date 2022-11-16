public class BankAccount {

    // properties
    String firstName;
    String lastName;
    String dateOfBirth;
    int accountNumber;
    int balance;

    // constructor
    public BankAccount(String firstName, String lastName, String dateOfBirth, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // methods
    public String deposit(int depositAmount) {
        return "You have deposited " + depositAmount + ".";
    }

    public String withdrawal(int withdrawalAmount) {
        return "You have withdrawn " + withdrawalAmount + ".";

//    void greet(String timeOfDay) {
//        System.out.println("Good " + timeOfDay + "!");
//    }
//    String generateBio() {
//        return "My name is " + this.name + " and I live in " + this.town + ".";
//    }

        // getters & setters

//        public String getFirstName() {
//            return this.firstName;
//        }
//        public void setFirstName (String newFirstName){
//            this.firstName = newFirstName;
//        }
//        public String getLastName() {
//            return this.lastName;
//        }
//        public void setLastName(String newLastName){
//            this.lastName = newLastName;
//        }
//
//        public String getDateOfBirth() {
//            return this.dateOfBirth;
//        }
//        public void setDateOfBirth(String newDateOfBirth){
//            this.dateOfBirth = newDateOfBirth;
//        }
//
//        public int getAccountNumber() {
//            return this.accountNumber;
//        }
//        public void setAccountNumber ( int newAccountNumber){
//            this.accountNumber = newAccountNumber;
//        }
//
//        public int getBalance () {
//            return this.balance;
//        }
//        public void setBalance ( int newSetBalance){
//            this.balance = newSetBalance;
//        }
//    }
    }
}