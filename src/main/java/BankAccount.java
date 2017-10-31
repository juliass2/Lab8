import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {
    /**
     * Random number generator.
     */
    private Random rnd = new Random();
    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    /**
     * Collection of different types of accounts.
     */
    public enum BankAccountType {
        /**
         * Checking account.
         */
        CHECKINGS,
        /**
         * Savings account.
         */
        SAVINGS,
        /**
         * Student account.
         */
        STUDENT,
        /**
         * Work place specific account.
         */
        WORKPLACE
    }
    /**
     * Number specific to an account.
     */
    private int accountNumber;
    /**
     * The bank account's type.
     */
    private BankAccountType accountType;
    /**
     * The amount within the bank account.
     */
    private double accountBalance;
    /**
     * The name of the person who owns the bank account.
     */
    private String ownerName;
    /**
     * The interest rate applied each year for the account.
     */
    private double interestRate;
    /**
     * The interest earned each year for the account.
     */
    private double interestEarned;

    /**
     * Constructor for making a bank account.
     * @param name the owner of the bank account
     * @param accountCategory the type of account this bank account is
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        Bank.setNumberOfAccount();
        accountNumber = Bank.getNumberOfAccount();
        accountBalance = 0;
        ownerName = name;
        accountType = accountCategory;
        interestRate = rnd.nextDouble();
        interestEarned = rnd.nextDouble();

    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /*SETTER METHODS*/
    /**
     * Allows user to change their account number.
     * @param number the new account number.
     */
    public void setAccountNumber(final int number) {
        accountNumber = number;
    }
    /**
     * Allows user to change their bank account type.
     * @param a new account type.
     */
    public void setAccountType(final BankAccountType a) {
        accountType = a;
    }
    /**
     * Allows the user to change the balance in the account.
     * @param amount the new balance.
     */
    public void setBalance(final double amount) {
        accountBalance = amount;
    }
    /**
     * Allows the user to change the owner's name on the account.
     * @param name the new name.
     */
    public void setName(final String name) {
        ownerName = name;
    }
    /**
     * Allows the user to change the interest rate on the bank account.
     * @param rate the new interest rate.
     */
    public void setInterestRate(final double rate) {
        interestRate = rate;
    }
    /**
     * Allows the user to change the interest earned on the bank account.
     * @param earned the new interest earned.
     */
    public void setInterestEarned(final double earned) {
        interestEarned = earned;
    }

    /*GETTER MEHOTDS*/
    /**
     * Allows user to see their account number.
     * @return the number related to this bank account.
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * Allows user to see their bank account type.
     * @return the bank account type.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
    /**
     * Allows the user to see their current balance.
     * @return the bank account balance.
     */
    public double getBalance() {
        return accountBalance;
    }
    /**
     * Allows the user to see their name for the account.
     * @return the bank account owner's name
     */
    public String getOwner() {
        return ownerName;
    }
    /**
     * Allows the user to see the interest rate for their account.
     * @return the bank account's interest rate.
     */
    public double getInterestRate() {
        return interestRate;
    }
    /**
     * Allows the user to see the interest earned for their account.
     * @return the bank account's interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}
