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
    static boolean[][] isVisited = null;
    static int N,M,cnt = 0;
    static Queue q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        //입력부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        map = new int[N][M];    //
        isVisited = new boolean[N][M];  // NullPointerException 선언 생성 빼먹지 않기
        int[] note1 = new int[M];

        for (int i = 0; i < N; i++) {
            note1 = Arrays.stream(br.readLine().split("")).
                    mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = note1[j];
            }
        }
        isVisited[0][0] = true;
        bfs(0,0);
        System.out.println(map[N-1][M-1]);


    }
    static void bfs(int x, int y){
        q.add(new int[]{x, y});

       while(!q.isEmpty()){
           int[] pos = (int[]) q.poll();
           int row = pos[0];
           int col = pos[1];
           for (int i = 0; i < dx.length; i++) {
               int nx = row + dx[i];
               int ny = col + dy[i];
               if(nx < 0 || nx >= N || ny < 0 || ny >= M) { continue;}
               if(map[nx][ny] == 0) { continue;}
               if(isVisited[nx][ny]){ continue;}
               if(map[nx][ny] == 0) { continue;}
               map[nx][ny] = map[row][col]+1;
               isVisited[nx][ny] = true;
               q.add(new int[]{nx, ny});
           }
       }
    }

}