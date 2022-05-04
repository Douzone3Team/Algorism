package com.example.demo;
import java.util.Scanner;
import java.io.FileInputStream;
public class HSR_1204 {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int[] score = new int[1000];
            int[] cnt = new int[101];
            int maxCnt = 0;
            int maxNum = 0;
            for (int i = 0; i < score.length; i++) {
                score[i] = sc.nextInt();
                cnt[score[i]]++;
                if(maxCnt < cnt[score[i]]){
                    maxNum = score[i];
                }
                maxCnt = Math.max(maxCnt, cnt[score[i]]);
            }
            for (int i = 0; i < cnt.length; i++) {
                if(cnt[i] == maxCnt){
                    maxNum = Math.max(maxNum,i);
                }
            }
            System.out.println("#"+ test_case + " " +maxNum);


        }
    }
}
