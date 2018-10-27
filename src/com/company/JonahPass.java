package com.company;

import java.util.HashMap;

public class JonahPass {
    private HashMap<String,String> passwords;

    public JonahPass() {
        passwords = new HashMap<>();
        passwords.put("Jonah","pass");
        passwords.put("Martin","schoki");
    }

    public JonahPass(String user, String pass) {
        passwords = new HashMap<>();
        passwords.put(user, pass);
    }
    public void addUser(String user,String pass){
        passwords.put(user,pass);
    }

    public Boolean checkPassword(String username, String password) {
        if(passwords.containsKey(username) == true) {
            //User ist in der Liste
            String passEntry = passwords.get(username);
            if(passEntry.equals(password)) {

                return true;
            } else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
