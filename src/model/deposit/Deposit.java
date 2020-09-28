package model.deposit;

public class Deposit {
    String firstName;
    String lastName;
    DepositType depositType;
    boolean hasCheckBook;
    boolean hasInterest;
    int minimumDeposit;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DepositType getDepositType() {
        return depositType;
    }

    public void setDepositType(DepositType depositType) {
        this.depositType = depositType;
    }

    public boolean isHasCheckBook() {
        return hasCheckBook;
    }

    public void setHasCheckBook(boolean hasCheckBook) {
        this.hasCheckBook = hasCheckBook;
    }

    public boolean isHasInterest() {
        return hasInterest;
    }

    public void setHasInterest(boolean hasInterest) {
        this.hasInterest = hasInterest;
    }

    public int getMinimumDeposit() {
        return minimumDeposit;
    }

    public void setMinimumDeposit(int minimumDeposit) {
        this.minimumDeposit = minimumDeposit;
    }

    @Override
    public String toString() {
        return "Deposit:" +
                "\nfirstName = '" + firstName + '\'' +
                "\nlastName = '" + lastName + '\'' +
                "\ndepositType = " + depositType +
                "\nhasCheckBook = " + hasCheckBook +
                "\nhasInterest = " + hasInterest +
                "\nminimumDeposit = " + minimumDeposit;
    }
}