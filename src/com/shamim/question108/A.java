package com.shamim.question108;

/**
 *
 * @author shamim
 */
public class A {
   public void method1(){
       try {
           B b = new B();
           b.method2();
           
       } catch (TestException te) {
           throw  new RuntimeException(te);
       }
   }
}
