package org.opentutorials.javatutorials.abstractclass.example1;
abstract class A{
    public abstract int b();
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    public void d(){
        System.out.println("world");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        //A obj = new A();
    	//오류 발생 ->  본체인 {System.out.println("Hello")}가 존재하는데 추상 메소드를 의미하는 abstract를 사용하고 있기 때문
    }
}