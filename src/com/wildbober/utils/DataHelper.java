package com.wildbober.utils;

import java.util.Scanner;

public class DataHelper {
    static Scanner in;
    DataHelper(){
        in = new Scanner(System.in);
    }

    public static int ScanInt(){
        int result = 0;
        try {
            result = in.nextInt();
        } catch (Exception exception) {
            System.out.println(exception);
        }

        return result;
    }

}
