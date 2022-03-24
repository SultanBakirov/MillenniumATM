package MillenniumATM_2;

import java.util.Arrays;
import java.util.Scanner;

public class Account {
    private double balance;
    private String[] accHolderName;
    private String[] accHolderPhoneNumber;
    private double withdrawAmount;
    private boolean accountExists;
    private Operation operation;
    private int[] deposit;
    private String[] nameArray = {};
    private String[] pinArray = {};
    private int[] sumArray = {};

    static final double MINIMUM_BALANCE = 1000.0;
    static final double DAILY_WITHDRAW_LIMIT = 5000.0;

    public Account() {
        balance = 0;
        this.withdrawAmount = 0.0;
        this.accountExists = false;
    }

    Scanner scanner = new Scanner(System.in);

    String[] nameArrayMethod() {
        System.out.print("\nWRITE FIRST NAME: ");
        String name = scanner.next();
        nameArray = Arrays.copyOf(nameArray,nameArray.length + 1);
        nameArray[nameArray.length - 1] = name;
        return nameArray;
    }

    String[] pinArrayMethod() {
        System.out.print("WRITE PIN-CODE: ");
        String pin = scanner.next();
        pinArray = Arrays.copyOf(pinArray,pinArray.length + 1);
        pinArray[pinArray.length - 1] = pin;
        return pinArray;
    }

    int[] sumArrayMethod() {
        int totalSum = readDeposit();
        sumArray = Arrays.copyOf(sumArray,sumArray.length + 1);
        sumArray[sumArray.length - 1] = totalSum;
        return sumArray;
    }

    void createNewAccount() {
        getUserDetails();
    }

    void transferMoney(int index) {
        System.out.print("\nTRANSFER MONEY:> ");
        int transMoney = scanner.nextInt();
        int sum = sumArray[index];
        sum = sum - transMoney;
        sumArray[index] = sum;
        System.out.print("WHOM TO SEND:> ");
        String name = scanner.next();
        for (int i = 0; i < nameArray.length; i++) {
            if (name.equalsIgnoreCase(nameArray[i])) {
                int sum2 = sumArray[i];
                sum2 = sum2 + transMoney;
                sumArray[i] = sum2;
                Operation operation5 = new Operation("Transfer", transMoney);
                System.out.println(operation5.showOperation() + "\n");
            }
        }
    }

    void showBalance() {
        System.out.println("\nTotal balance -> " + Arrays.toString(getSumArray()) + "\n");
    }

    void depositMain(int index) {
        int depositEnter = readDeposit();
        int depositSum = sumArray[index];
        depositEnter += depositSum;
        sumArray[index] = depositEnter;
        System.out.println("\nBalance topped up successfully..." + sumArray[index]);
        Operation operation3 = new Operation("Deposit", depositEnter);
        System.out.println(operation3.showOperation() + "\n");
    }

    void withdrawMethod(int index) {
        System.out.print("\n===== CASH WITHDRAWAL =====> ");
        int withdrawEnter = scanner.nextInt();
        sumArray[index] -= withdrawEnter;
        System.out.println("Balance -> " + sumArray[index]);
        Operation operation4 = new Operation("Withdraw", withdrawEnter);
        System.out.println(operation4.showOperation() + "\n");
    }

    void getUserDetails() {
        accHolderName = nameArrayMethod();
        accHolderPhoneNumber = pinArrayMethod();
        warningMessage();
        deposit = sumArrayMethod();
            setAccountExists(true);
            accountCreated();
    }

    void accountCreated() {
        System.out.println("\nACCOUNT CREATED SUCCESSFULLY !!!\n");
    }

    String readAccHolderName() {
        System.out.print("\n===== ENTER FIRST NAME =====> ");
        String name = scanner.nextLine();
        return name;
    }

    String readAccHolderPhoneNumber() {
        System.out.print("\n===== ENTER YOUR NUMBER =====> +48");
        String phoneNumber = scanner.nextLine();
        return phoneNumber;
    }

    void warningMessage() {
        System.out.println("\nMINIMUM_BALANCE = 1000.0\nDAILY_WITHDRAW_LIMIT = 5000.0");
    }

    int readDeposit() {
        System.out.print("\n===== ENTER DEPOSIT =====> ");
        int sum = scanner.nextInt();
        return sum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String[] getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String[] accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String[] getAccHolderPhoneNumber() {
        return accHolderPhoneNumber;
    }

    public void setAccHolderPhoneNumber(String[] accHolderPhoneNumber) {
        this.accHolderPhoneNumber = accHolderPhoneNumber;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public boolean isAccountExists() {
        return accountExists;
    }

    public void setAccountExists(boolean accountExists) {
        this.accountExists = accountExists;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int[] getDeposit() {
        return deposit;
    }

    public void setDeposit(int[] deposit) {
        this.deposit = deposit;
    }

    public String[] getNameArray() {
        return nameArray;
    }

    public void setNameArray(String[] nameArray) {
        this.nameArray = nameArray;
    }

    public String[] getPinArray() {
        return pinArray;
    }

    public void setPinArray(String[] pinArray) {
        this.pinArray = pinArray;
    }

    public int[] getSumArray() {
        return sumArray;
    }

    public void setSumArray(int[] sumArray) {
        this.sumArray = sumArray;
    }
}
