import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HSR_7569 {
    static int[][][] map;
    static boolean[][][] isVisited;
    static Queue q = new LinkedList<>();
    static int[] dx = { -1, 0, 1, 0, 0, 0 };
    static int[] dy = { 0, -1, 0, 1, 0, 0 };
    static int[] dz = { 0, 0, 0, 0, 1, -1 };
    static int M, N, H, max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] note;

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][M][N]; isVisited = new boolean[H][M][N];


        for (int i = 0; i < H; i++) {
            for (int j = 0; j < M; j++) {
                note = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int k = 0; k < N; k++) {
                    map[i][j][k] = note[k];
                    if(map[i][j][k] == 1 ){
                        System.out.println("add que");
                        q.add(new int[]{i,j,k});
                    }

                }
            }
        }

        for (int i2 = 0; i2 < H; i2++) {
            for (int j2 = 0; j2 < M; j2++) {
                for (int k2 = 0; k2 < N; k2++) {
                    System.out.print(map[i2][j2][k2] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("===========================");
        bfs();
    }
    static void bfs(){
        System.out.println("start bfs");
        while( !q.isEmpty()){
            System.out.println("start while");
            int[] pos = (int[])q.poll();
            int row = pos[2]; int col = pos[1]; int height = pos[0];

            for (int i = 0; i < dx.length; i++) {
                int nx = row + dx[i];
                int ny = col + dy[i];
                int nz = height + dz[i];

                if(nx < 0 || ny < 0 || nz < 0 || nx >= N || ny >= M || nz >= H){ continue;}

                if(map[nz][ny][nx] == 0){
                    q.add(new int[] {nz, ny, nx});
                    map[nz][ny][nx] = map[height][col][row] + 1;
                    for (int i2 = 0; i2 < H; i2++) {
                        for (int j2 = 0; j2 < M; j2++) {
                            for (int k2 = 0; k2 < N; k2++) {
                                System.out.print(map[i2][j2][k2] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                }
            }
        }

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if(map[i][j][k] == 0){
                        result = -1;
                        break;
                    }
                    result = Math.max(result, map[i][j][k]);

                }
            }
        }

        System.out.println(result -1);
    }
}