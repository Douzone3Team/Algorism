package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HSR_1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int t = 1; t <= 10; t++) {
            int time = Integer.parseInt(br.readLine());
            int[][] map = new int[100][100];
            int max = 0;

            for(int i = 0; i < 100; i++) {
                int sum = 0;
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 100; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    sum += map[i][j];
                }
                max = Math.max(sum, max);
            }

            for(int i = 0; i < 100; i++) {
                int sum = 0;
                for(int j = 0; j < 100; j++) {
                    sum += map[j][i];
                }
                max = Math.max(sum, max);
            }
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i < 100; i++) {
                sum1 += map[i][i];
                sum2 += map[i][100-1-i];
            }
            max = Math.max(((sum1 > sum2) ? sum1 : sum2), max);
            System.out.println("#" + time + " " + max);
        }
    }
}
