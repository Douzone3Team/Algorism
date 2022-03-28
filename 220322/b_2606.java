package baekjoon;

import java.util.Scanner;

public class b_2606 {
    static int N, answer;
    static boolean[] V;
    static boolean[][] M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        V = new boolean[N + 1];
        M = new boolean[N + 1][N + 1];
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int n1 = sc.nextInt(); 
            int n2 = sc.nextInt();

            M[n1][n2] = M[n2][n1] = true;
        }

        dfs(1);
        System.out.println(answer - 1);

    }

    static void dfs(int n) {
        if (V[n]) return;

        V[n] = true;
        answer++;
        for (int i = 1; i <= N; i++) {
            if (M[n][i])
                dfs(i);
        }
    }
}