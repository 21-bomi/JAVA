package org.opentutorials.javatutorials.array;
 
public class ForeachDemo {
 
    public static void main(String[] args) {
        String[] members = { "조보미", "이한비", "박소정" };
        for (String e : members) {
            System.out.println(e + "이 상담을 받았습니다");
        }
    }
 
}