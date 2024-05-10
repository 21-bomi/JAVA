package org.opentutorials.javatutorials.Inheritance.example1;
 
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

class DivisionableCalculator extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
    
   
}

//public class CalculatorDemo2 {
//	 
//    public static void main(String[] args) {
// 
//        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
//        c1.setOprands(10, 20);
//        c1.sum();
//        c1.avg();
//        c1.multiplication();
//    }
// 
//}
//
//public class CalculatorDemo3 {
//	 
//    public static void main(String[] args) {
// 
//        DivisionableCalculator c1 = new DivisionableCalculator();
//        c1.setOprands(10, 20);
//        c1.sum();
//        c1.avg();
//        c1.multiplication();
//        c1.division();
//    }
// 
//}