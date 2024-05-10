package org.opentutorials.javatutorials.compare;
 
public class EqualStringDemo {
 
    public static void main(String[] args) {
        String a = "BoMi";
        String b = new String("BoMi");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
 
}