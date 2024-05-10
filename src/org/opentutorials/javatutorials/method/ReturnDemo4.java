package org.opentutorials.javatutorials.method;
 
public class ReturnDemo4 {
 
    public static String[] getMembers() {
        String[] members = { "조보미", "이한비", "박소정" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
    }
 
}