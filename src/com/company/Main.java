package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JonahPass myPasswordSafe = new JonahPass();
        Scanner s = new Scanner(System.in);
        boolean userValidated = false;

        while(userValidated == false){
            System.out.println("Enter User");
            String user = s.next();
            System.out.println("Enter password");
            String password = s.next();

            Boolean checkResult = myPasswordSafe.checkPassword(user,password);
            if(checkResult == true){
                JonahTextfile.createTextFile();
                System.out.println("Passwort check: " + checkResult);
                String myVariable = "Bentzer zugelassen, öffne Fenster...";
                System.out.println(myVariable);
                Integer myInteger = 11;
                System.out.println(myInteger);
                System.out.println(Math.pow(myInteger, 2));
                System.out.println(JonahCalc.pow(myInteger,2));
                userValidated = true;
                System.out.println("User korrekt. Beende Programm");
                JonahWindow gui = new JonahWindow();
                JonahWindow gui2 = new JonahWindow();
                gui.setUsedPassword(password);
                gui.launch(user,password,"MyFreakyButton");
                gui2.launch("Transformer!","pass3","BumbleBee");
            }
            else{
                System.out.println("Fehlgeschlagen");
                System.out.println("User nicht bekannt, Nutzername/Passwort prüfen.");
            }
        }

    }
}
