package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HSR_1206 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = 10;
        for (int tt = 1; tt <= t; tt++) {z
            int n = Integer.parseInt(br.readLine());
            int[] info = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                info[i] = Integer.parseInt(st.nextToken());
            }
            int res = 0;
            for (int i = 2; i < n - 2; i++) {
                int next_h = 0;
                for (int j = 1; j <= 2; j++) {
                    if (info[i] < info[i + j]) {
                        next_h = info[i + j];
                        break;
                    }
                    if (info[i] < info[i - j]) {
                        next_h = info[i - j];
                        break;
                    }
                    next_h = Math.max(next_h, info[i + j]);
                    next_h = Math.max(next_h, info[i - j]);
                }
                if (info[i] <= next_h) {
                    continue;
                }
                res += info[i] - next_h;
            }
            sb.append("#").append(tt).append(" ").append(res).append("\n");
        }
        System.out.println(sb);
    }
}


