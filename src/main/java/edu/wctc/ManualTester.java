package edu.wctc;

public class ManualTester {
    public static void main(String[] args) {
        Calculator c = new Calculator("TI-84");
        double sum = c.add(1,1);
        if (sum != 2) {
            System.out.println("add() failed, expected 2, got " + sum);
        }
        double diff = c.subtract(1,1);
        if (diff != 0) {
            System.out.println("Subtract() failed, expected 0, got " + diff);
        }
    }
}
