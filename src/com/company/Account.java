package com.company;

import java.util.Scanner;

public class Account {
    private double balance;
    private String accHolderName;
    private String accHolderPhoneNumber;
    private double withdrawAmount;
    private boolean accountExists;
    private Operation operation;
    private double deposit;

    static final double MINIMUM_BALANCE = 1000.0;
    static final double DAILY_WITHDRAW_LIMIT = 5000.0;

    public Account() {
        balance = 0;
        this.withdrawAmount = 0.0;
        this.accountExists = false;
    }

    Scanner scanner = new Scanner(System.in);

    void createNewAccount() {
        getUserDetails();
    }

    void showBalance() {
        System.out.println("\nTotal balance -> " + getBalance() + "\n");
    }

    void depositMain() {
        int depositEnter = readDeposit();
        balance += depositEnter;
        System.out.println("\nBalance topped up successfully...");
        Operation operation1 = new Operation("Deposit", depositEnter);
        System.out.println(operation1.showOperation() + "\n");
    }

    void withdrawMethod() {
        System.out.print("\n===== CASH WITHDRAWAL =====> ");
        int withdrawEnter = scanner.nextInt();
        balance -= withdrawEnter;
        System.out.println("\nYour operation was successfully...");
        Operation operation2 = new Operation("Withdraw", withdrawEnter);
        System.out.println(operation2.showOperation() + "\n");

    }

    void getUserDetails() {
        accHolderName = readAccHolderName();
        accHolderPhoneNumber = readAccHolderPhoneNumber();
        warningMessage();
        deposit = readDeposit();
        if (deposit < MINIMUM_BALANCE) {
            System.out.println("\nPLEASE REPLENISH THE BALANCE MORE THE 1000 !!!");
        } else {
            setBalance(deposit);
            setAccountExists(true);
            accountCreated();
        }
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

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public String getAccHolderPhoneNumber() {
        return accHolderPhoneNumber;
    }

    public void setAccHolderPhoneNumber(String accHolderPhoneNumber) {
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

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
