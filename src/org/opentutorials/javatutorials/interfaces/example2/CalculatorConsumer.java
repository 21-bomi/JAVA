package org.opentutorials.javatutorials.interfaces.example2;

interface Calculatable {
    public void setOprands(int first, int second, int third) ;
    public int sum(); 
    public int avg();
}

public class CalculatorConsumer {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}
 
class Calculator implements Calculatable {
    int first, second, third;
    public void setOprands(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public int sum() {
        return this.first + this.second + this.third;
    }
    public int avg() {
        return (this.first + this.second + this.third) / 3;
    }
}