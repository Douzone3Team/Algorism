package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_4963 {
    static int[][] arr;
    static boolean[][] check;

    static int[] x = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] y = {0, 0, -1, 1, 1, -1, -1, 1};

    static int w, h;

    public static void dfs(int a, int b) {
        for(int i = 0; i < 8; i++) {
            int nx = a + x[i];
            int ny = b + y[i];
            if(0 <= nx && nx < h && 0 <= ny && ny < w &&
                    !check[nx][ny] && arr[nx][ny] == 1) {
                check[nx][ny] = true;
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        while(true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(w == 0 && h == 0) break;

            arr = new int[h][w];
            check = new boolean[h][w];
            for(int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if(!check[i][j] && arr[i][j] == 1) {
                        check[i][j] = true;
                        dfs(i, j);
                        cnt += 1;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}