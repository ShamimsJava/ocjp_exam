package com.shamim.question122;

public class Hi {
    void m1(){}
    protected  void m2(){}
}

class Lois extends Hi{
    //void m1(){};
    //protected void m1(){}
    //public void m1(){}
    //private  void m1(){} // error
}

/*
* public > protected > default > private
* */