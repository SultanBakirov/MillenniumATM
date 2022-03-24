package MillenniumATM_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     mainMethod();
    }
    public static void mainMethod() {
        Operation operation = new Operation();
        System.out.println("" +
                "\n=============== *** MILLENNIUM ATM *** ===============");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "===============> 1.CREATE NEW ACCOUNT <===============\n" +
                    "===============>     2.OPERATIONS     <===============\n" +
                    "===============>        3.EXIT        <===============");
            System.out.println("\n======================================================");
            System.out.print("\n===== TYPE YOUR CHOICE =====> ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    operation.createNewAccount();
                    break;
                case 2:
                    operation.operation2();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
