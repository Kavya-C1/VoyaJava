package com.api.serial;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try( FileWriter fileWriter =  new FileWriter("trail.txt");
             FileReader fileReader =  new FileReader("demo.txt");
        ) {
            int num = fileReader.read();
            fileWriter.write((char)num);
            do {
                num = fileReader.read();
                fileWriter.write((char)num);
            }while (num!=-1);

        }catch (Exception e){
            e.printStackTrace();
        }
//        finally {
//            try {
//                if (fileWriter!=null)
//                    fileWriter.close();
//                if (fileReader!=null)
//                    fileReader.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
    }
}
