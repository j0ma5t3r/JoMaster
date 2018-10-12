package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JonahPass myPasswordSafe = new JonahPass();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter User");
        String user = s.next();

        System.out.println("Enter password");
        String password = s.next();

        Boolean checkResult = myPasswordSafe.checkPassword(user,password);
        if(checkResult == true){
            JonahTextfile.createTextFile();
            System.out.println("Passwort check: " + checkResult);
            String myVariable = "Hello";
            System.out.println(myVariable);
            Integer myInteger = 11;
            System.out.println(myInteger);
            System.out.println(Math.pow(myInteger, 2));
            System.out.println(JonahCalc.pow(myInteger,2));
        }
        else{
            System.out.println("Fehlgeschlagen");
            myPasswordSafe.addUser(user,password);
        }
    }


}
