package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HSR_1210{
    static int T;
    static int[] dx = {-1, 1};
    static int[][] map;
    static boolean[][] isVisited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 1; i <= 10; i++) {
            T = Integer.parseInt(br.readLine());
            map = new int[100][100];
            isVisited = new boolean[100][100];
            for (int j = 0; j < 100; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 100; k++) {
                    map[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            for (int j = 0; j < 100; j++) {
                if(map[99][j] == 2) {
                    int result = ladder(99, j);
                    System.out.println("#" + T + " " + result);
                }
            }
            
        }
    }
    static int ladder(int y, int x) {
        isVisited[y][x] = true;
        while(true){
            boolean check = true;
            if( y == 0){
              return x;
            }
            for (int i = 0; i < dx.length; i++) {
                if ((x + dx[i] >= 100 || (x + dx[i] < 0))) continue;
                if(map[y][x + dx[i]] == 1 && isVisited[y][x + dx[i]] == false){
                    isVisited[y][x + dx[i]] = true;
                    x += dx[i];
                    check = false;
                    break;
                }
            }
            if (check == true) {
                y--;
                isVisited[y][x] = true;
            }


        }
    }

}
