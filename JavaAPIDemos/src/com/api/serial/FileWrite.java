package com.api.serial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWrite {
    public static void main(String[] args) {

        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(iReader);

        try {
            char c = (char) bufferedReader.read();
            while (c != 'q') {
                System.out.print(c);
                c = (char) bufferedReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
