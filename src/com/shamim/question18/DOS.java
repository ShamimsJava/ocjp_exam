package com.shamim.question18;

import java.io.File;
import java.io.IOException;

public class DOS {

    public static void main(String[] args) {

        File dir = new File("dir");

        dir.mkdir();

        File f1 = new File(dir, "f1.txt");

        try {

            f1.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

        File newDir = new File("newDir");

        dir.renameTo(newDir);
    }
}
