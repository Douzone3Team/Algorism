package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HSR_15649 {
    static int[] arr;
    static boolean[] isVisit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N, M; // N:수의 최대치, M:노드의 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        isVisit = new boolean[N];

        dfs(N, M,0);


    }

    static void dfs(int N, int M, int depth){
        if (depth == M){    // 깊이가 노드의 개수와 같아지면 출력
            for (int val: arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return; // 재귀 전으로 제어권을 돌려준다.
        }

        for (int i = 0; i < N; i++) {   //  수의 최대값 만큼 반복
            if(!isVisit[i]){    //방문하지 않은 노드일때 방문기록 남기고 해당 번호 입력
                isVisit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);   // 다음 하위 레벨 노드로 이동
                isVisit[i] = false; 
            }
        }
    }


}
