
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HSR_2178 {
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
    static int[][] map = null;
    static int N,M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        int[] note1 = new int[M];

        for (int i = 0; i < N; i++) {
            note1 = Arrays.stream(br.readLine().split("")).
                    mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = note1[j];
            }
        }


    }
    static void bfs(){
        Queue<Integer> q = new int[]{x , y};


    }
}