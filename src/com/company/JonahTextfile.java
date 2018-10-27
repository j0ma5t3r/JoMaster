package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JonahTextfile {

    public static void createTextFile()
    {

        File f = new File("/Users/JoMaster/Documents/testJava.txt");
        f.getParentFile().mkdirs();
        try {
            f.createNewFile();
            String logFile;
            BufferedWriter writer = new BufferedWriter(new FileWriter(f));
            writer.write ("Hello World");

            //Close writer
            writer.close();
            //irgendeine andere methode geht schief


        } catch (IOException e) {
            System.out.println("Konnte Datei nicht anlegen.");
            e.printStackTrace();
        }


    }

}
