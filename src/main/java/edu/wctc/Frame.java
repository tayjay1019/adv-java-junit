package edu.wctc;

public class Frame {
    private int atpt1;
    private int atpt2;
    private int atpt3;
    private int total;

    public Frame (int attempt1, int attempt2)
    {
        atpt1 = attempt1;
        atpt2 = attempt2;
    }

    public Frame(int attempt1, int attempt2, int attempt3){
        atpt1 = attempt1;
        atpt2 = attempt2;
        atpt3 = attempt3;
    }

    public int getAtpt1() {
        return atpt1;
    }

    public void setAtpt1(int atpt1) {
        this.atpt1 = atpt1;
    }

    public int getAtpt2() {
        return atpt2;
    }

    public void setAtpt2(int atpt2) {
        this.atpt2 = atpt2;
    }

    public int getAtpt3() {
        return atpt3;
    }

    public void setAtpt3(int atpt3) {
        this.atpt3 = atpt3;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
