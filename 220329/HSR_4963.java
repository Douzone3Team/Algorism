import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HSR_4963 {
    static int[] dx = { 0, 0, 1, -1, -1, 1, -1, 1 };
    static int[] dy = { 1, -1, 0, 0, -1, 1, 1, -1 };

    static int[][] map = null;
    static boolean[][] isVisited = null;
    static int N,M;
    static Queue q = new LinkedList<>();
    static int[] note1;
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        //입력부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            cnt = 0;
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            if(N == 0 && M == 0) { break; }
            map = new int[M][N];
            isVisited = new boolean[M][N];
            for (int i = 0; i < M; i++) {
                note1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int j = 0; j < N; j++) {
                    map[i][j] = note1[j];
                }
            }
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if((!isVisited[i][j]) && map[i][j] == 1){
                        dfs(i,j);
                        cnt++;
                    }


                }
            }
            System.out.println(cnt);

        }
    }
    static void dfs(int x, int y){
        isVisited[x][y] = true;



        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>= 0 && ny >= 0 && nx < M && ny < N ){



                if((!isVisited[nx][ny]) && map[nx][ny] == 1){
                    dfs(nx, ny);

                }

            }

        }


    }
}