package com.example.demo;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class HSR_1208_sort {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        for (int i2 = 1; i2 <= 10 ; i2++) {
            int dump = sc.nextInt();
            int[] box = new int[100];

            for (int i = 0; i < box.length; i++) {
                box[i] = sc.nextInt();
            }
            Arrays.sort(box);
            for (int i = 0; i < dump; i++) {
                box[0]++;
                box[99]--;
                Arrays.sort(box);
            }
            System.out.println("#"+ i2 + " " +(box[99] - box[0]));
        }
    }
}