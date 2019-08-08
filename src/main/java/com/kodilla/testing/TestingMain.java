package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println();
        System.out.println("Zadanie - testowanie dodawania:");
        int addResult = Calculator.add(7,5);
        if (addResult == 12) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Error!");
        }
    }
}
