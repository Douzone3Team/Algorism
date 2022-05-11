package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HSR_1211 {
        static int T;
        static int[] dx = {-1, 1};
        static int move = 0, start = 0;
        static int min = Integer.MAX_VALUE;
        static int minI = 0;
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
                min = Integer.MAX_VALUE;
                for (int j = 0; j < 100; j++) {

                   if(map[0][j] == 1){

                       start = j;
                       isVisited = new boolean[100][100];
                       ladder(0, j);
                       if(move < min){
                           min = Math.min(move, min);

                           minI = start;
                       }
                   }
                }
                System.out.println("#" + T + " " + minI);

            }
        }
        static void ladder(int y, int x) {

            isVisited[y][x] = true;
            move = 0;
            while(true){
                boolean check = true;
                if( y == 99){
                    break;
                }
                for (int i = 0; i < dx.length; i++) {
                    if ((x + dx[i] >= 100 || (x + dx[i] < 0))) continue;
                    if(map[y][x + dx[i]] == 1 && isVisited[y][x + dx[i]] == false){
                        isVisited[y][x + dx[i]] = true;
                        x += dx[i];
                        move++;
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    y++;
                    isVisited[y][x] = true;
                }
            }

        }
    }

