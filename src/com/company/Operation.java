package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation {
    private String type;
    private double amount;
    private Date date;

    public Operation(String type, double amount) {
        this.type = type;
        this.amount = amount;
        setDate(new Date());
    }

    String showOperation() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String transaction = type + " " + amount + " " + dateFormat.format(date);
        return transaction;
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
