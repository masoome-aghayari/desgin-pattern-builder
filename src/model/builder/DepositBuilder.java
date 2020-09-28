package model.builder;

import model.deposit.Deposit;
import model.deposit.DepositType;

public class DepositBuilder {
    String firstName;
    String lastName;
    DepositType depositType;
    boolean hasCheckBook;
    boolean hasInterest;
    int minimumDeposit;

    public static DepositBuilder aDeposit() {
        return new DepositBuilder();
    }

    public DepositBuilder withDepositFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public DepositBuilder withDepositLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public DepositBuilder withDepositType(DepositType depositType) {
        this.depositType = depositType;
        return this;
    }

    public DepositBuilder withHasCheckBook(boolean hasCheckBook) {
        this.hasCheckBook = hasCheckBook;
        return this;
    }

    public DepositBuilder withHasInterest(boolean hasInterest) {
        this.hasInterest = hasInterest;
        return this;
    }

    public DepositBuilder withMinimumDeposit(int minimumDeposit) {
        this.minimumDeposit = minimumDeposit;
        return this;
    }

    public Deposit buildDeposit() {
        Deposit deposit = new Deposit();
        deposit.setFirstName(this.firstName);
        deposit.setLastName(this.lastName);
        deposit.setDepositType(this.depositType);
        deposit.setHasCheckBook(this.hasCheckBook);
        deposit.setHasInterest(this.hasInterest);
        deposit.setMinimumDeposit(this.minimumDeposit);
        return deposit;
    }

}
