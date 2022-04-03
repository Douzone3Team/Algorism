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
        //입력부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] note; StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][M][N]; isVisited = new boolean[H][M][N];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < M; j++) {
                note = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int k = 0; k < N; k++) {
                    map[i][j][k] = note[k];
                    if(map[i][j][k] == 1 ){ // 사과가 있을시 큐에 추가( 큐를 기준으로 익은 날짜 증가 )

                        q.add(new int[]{i,j,k});
                    }

                }
            }
        }
        bfs();
    }
    static void bfs(){
        while( !q.isEmpty()){
            int[] pos = (int[])q.poll();
            int row = pos[2]; int col = pos[1]; int height = pos[0];
            for (int i = 0; i < dx.length; i++) {            // 상하좌우 z축 위 아래 검사
                int nx = row + dx[i];
                int ny = col + dy[i];
                int nz = height + dz[i];
                if(nx < 0 || ny < 0 || nz < 0 || nx >= N || ny >= M || nz >= H){ continue;}

                if(map[nz][ny][nx] == 0){   //익은 사과가 있는 인접한 배열 옆 안익은 사과는 이전 사과가 익은 날짜의 +1
                    q.add(new int[] {nz, ny, nx});  //새로 익은 사과를 기준으로 검사하기 위해 큐에 새로 익은 사과 추가
                    map[nz][ny][nx] = map[height][col][row] + 1;
                }
            }
        }

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if(map[i][j][k] == 0){  // 사과가 익지 못하면 -1출력하고 제어권 돌려줌
                        System.out.println(-1);
                        return;
                    }
                    result = Math.max(result, map[i][j][k]);    //사과가 익은 날짜의 최대값을 구하기 위해 Math.max를 이용해 최대값 가져오기
                }
            }
        }
        System.out.println(result -1);  //기존에 사과가 있던 배열의 값이 1이므로 -1을 해줘야함
    }
}