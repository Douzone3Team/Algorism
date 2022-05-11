package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HSR_1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T;

        for (int i = 0; i < 10; i++) {
            T = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String input = br.readLine();
            String arr[] = input.split(str,-1);

            System.out.println("#" + T + " " + (arr.length-1));



        }
    }
}
