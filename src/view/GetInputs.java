package view;

import model.deposit.DepositType;

import java.util.Scanner;

public class GetInputs {
    Scanner scanner = new Scanner(System.in);

    public DepositType getDepositType() {
        System.out.println("Choose your deposit type:\n1-"
                + DepositType.ShortTimeDeposit
                + "\n2-" + DepositType.LongTimeDeposit
                + "\n3-" + DepositType.CheckingDeposit);
        Integer depositType = getInBoundInteger(3);
        if (depositType == 1)
            return DepositType.ShortTimeDeposit;
        else if (depositType == 2)
            return DepositType.LongTimeDeposit;
        else
            return DepositType.CheckingDeposit;

    }

    public String getAlphabeticString(String wantedField) {
        System.out.println("Enter your " + wantedField);
        while (true) {
            String string = scanner.next();
            if (string.matches("[A-Za-z]+"))
                return string;
            else
                System.out.println("just alphabets are allowed...\ntry again:");
        }
    }

    public Integer getInBoundInteger(int bound) {
        while (true) {
            String input = scanner.next();
            if (input.matches("[1-9]+")) {
                Integer intInput = Integer.parseInt(input);
                if (intInput <= bound)
                    return intInput;
                else
                    System.out.println("Input not in bound...\ntry again");
            } else
                System.out.println("Enter a numeric input...");
        }
    }

    public Integer getInteger() {
        while (true) {
            String input = scanner.next();
            if (input.matches("[1-9]+"))
                return Integer.parseInt(input);
            else
                System.out.println("Enter a numeric input...");
        }
    }
}