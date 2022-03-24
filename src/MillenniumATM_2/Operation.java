package MillenniumATM_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation extends Account{
    private String type;
    private double amount;
    private Date date;

    public Operation(String type, double amount) {
        this.type = type;
        this.amount = amount;
        setDate(new Date());
    }

    public Operation() {
    }

    void operation1(int index) {
        while (true) {
            showMenu();
            System.out.print("\n===== TYPE YOUR CHOICE =====> ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    depositMain(index);
                    break;
                case 2:
                    withdrawMethod(index);
                    break;
                case 3:
                    showBalance();
                    break;
                case 4:
                    transferMoney(index);
                    break;
                case 5:
                    Main.mainMethod();
//                    System.exit(0);
            }
        }
    }

    void operation2() {
        System.out.print("\nWRITE FIRST NAME: ");
        String name = scanner.next();
        int counter = 0;
        for (String firstName: getNameArray()) {
            if (firstName.equalsIgnoreCase(name)) {
                System.out.print("WRITE PIN-CODE: ");
                String pin = scanner.next();
                for (String pinCode: getPinArray()) {
                    if (pinCode.equalsIgnoreCase(pin)) {
                        operation1(counter);
                    }
                }
                counter++;
            }
        }
    }

    String showOperation() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String transaction = type + " " + amount + " " + dateFormat.format(date);
        return transaction;
    }

    void showMenu() {
        System.out.println(
                "\n==================>  1.DEPOSIT <==================\n" +
                "==================> 2.WITHDRAW <==================\n" +
                "==================>  3.BALANCE <==================\n" +
                "==================> 4.TRANSFER <==================\n" +
                "==================>   5.MAIN   <==================");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
