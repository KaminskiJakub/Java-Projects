package inheritance.classesChallenge;

// Depose and withdraw money from account

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposeFoundsIntoTheAccount(1000);
        account.withdrawFundsFromTheAccount(600);
    }
}
