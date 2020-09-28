package view;

import model.deposit.Deposit;
import service.DepositService;

import java.util.ArrayList;
import java.util.List;

public class DepositMain {
    public static void main(String[] args) {
        GetInputs getInputs = new GetInputs();
        DepositService depositService = new DepositService();
        System.out.println("Enter Number Of Deposits:");
        int numberOfDeposits = getInputs.getInteger();
        List<Deposit> deposits = new ArrayList<>();

        for (int i = 0; i < numberOfDeposits; i++) {
            deposits.add(depositService.openDeposit());

        }
        deposits.forEach(System.out::println);
    }
}