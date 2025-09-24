package com.example.week2v2;

public class Calculator {

    private String operation;
    private double total;

    public Calculator(String operation, double total) {
        this.operation = operation;
        this.total = total;
    }

    public String getOperation() {
        return operation;
    }

    public double getTotal() {
        return total;
    }
}
