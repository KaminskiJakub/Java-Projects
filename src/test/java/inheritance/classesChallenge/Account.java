package inheritance.classesChallenge;

public class Account {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;

    public void deposeFoundsIntoTheAccount(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit made for : " + depositAmount + "$." + " Current balance is " +  accountBalance + "$");
    }

    public void withdrawFundsFromTheAccount(double withdrawalAmount) {
        if (accountBalance - withdrawalAmount < 0) {
            System.out.println("Not enough founds. There is " + accountBalance + " $ in your account.");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + "$" + " Current balance is " + accountBalance + "$.");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int phoneNumber;
}
