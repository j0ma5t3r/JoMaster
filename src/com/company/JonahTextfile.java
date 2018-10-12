package com.company;

import java.io.File;
import java.io.IOException;

public class JonahTextfile {

    public static void createTextFile()
    {

        File f = new File("/Users/Maya/Documents/test.txt");
        f.getParentFile().mkdirs();
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
