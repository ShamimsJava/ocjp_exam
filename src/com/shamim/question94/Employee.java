package com.shamim.question94;

abstract public class Employee {
    protected abstract double getSalesAmount();
    public double getCommision(){
        return getSalesAmount()*0.15;
    }
}

class Sales extends Employee{

    /*
    @Override
    protected double getSalesAmount() {
        return 1230.45;
    }
    */

    @Override
    public double getSalesAmount() {
        return 1230.45;
    }
}
