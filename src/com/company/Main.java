package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(
                "============================================================================== *** MILLENNIUM ATM *** ==============================================================================\n" +
                "==============================================================================> 1.CREATE NEW ACCOUNT <==============================================================================");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "============================================================================> 2.DISPLAY BALANCE AMOUNT <============================================================================\n" +
                    "================================================================================> 3.DEPOSIT MONEY <=================================================================================\n" +
                    "================================================================================> 4.WITHDRAW MONEY <================================================================================\n" +
                    "=====================================================================================> 5.EXIT <=====================================================================================");
            System.out.println("\n====================================================================================================================================================================================");
            System.out.print("\n===== TYPE YOUR CHOICE =====> ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    account.createNewAccount();
                    break;
                case 2:
                    if (account.isAccountExists()) {
                        account.showBalance();
                    } else {
                        System.out.println("No account");
                    }
                    break;
                case 3:
                    if (account.isAccountExists()) {
                        account.depositMain();
                    } else {
                        System.out.println("No account");
                    }
                    break;
                case 4:
                    if (account.isAccountExists()) {
                        account.withdrawMethod();
                    } else {
                        System.out.println("No account");
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
