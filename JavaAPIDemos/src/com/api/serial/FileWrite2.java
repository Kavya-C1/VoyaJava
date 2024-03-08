package com.api.serial;

import java.io.*;

public class FileWrite2 {
    public static void main(String[] args) {

        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(iReader);

        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("demo.txt");
            char c = (char) bufferedReader.read();
            while (c != 'q') {
                System.out.print(c);
                fileOutputStream.write(c);
                c = (char) bufferedReader.read();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fileOutputStream!=null)
                fileOutputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
