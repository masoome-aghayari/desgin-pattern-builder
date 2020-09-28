package service;

import model.builder.DepositBuilder;
import model.deposit.Deposit;
import model.deposit.DepositType;
import view.GetInputs;

public class DepositService {
    public Deposit openDeposit() {
        GetInputs getInputs = new GetInputs();
        DepositType depositType = getInputs.getDepositType();

        DepositBuilder depositBuilder = DepositBuilder.aDeposit()
                .withDepositFirstName(getInputs.getAlphabeticString("firstName"))
                .withDepositLastName(getInputs.getAlphabeticString("lastName"))
                .withDepositType(depositType);

        if (depositType.equals(DepositType.ShortTimeDeposit)) {
            depositBuilder.withHasCheckBook(false)
                    .withHasInterest(true)
                    .withMinimumDeposit(50000);
        } else if (depositType.equals(DepositType.CheckingDeposit)) {
            depositBuilder.withHasCheckBook(true)
                    .withHasInterest(false)
                    .withMinimumDeposit(100000);
        } else {
            depositBuilder.withHasCheckBook(false)
                    .withHasInterest(false)
                    .withMinimumDeposit(100000);
        }
        return depositBuilder.buildDeposit();
    }
}