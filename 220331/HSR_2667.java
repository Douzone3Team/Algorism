import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HSR_2667 {
    static int[] dx = { 0, 0, 1, -1 };
    static int[] dy = { 1, -1, 0, 0 };

    static int[][] map = null;
    static boolean[][] isVisited = null;
    static int N,M;
    static Queue q = new LinkedList<>();
    static int[] note1;
    static int cnt = 0,home = 0;
    public static void main(String[] args) throws IOException {
        //입력부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        ArrayList<Integer> arr = new ArrayList<>();
        cnt = 0;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());


        map = new int[N][N];
        isVisited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            note1 = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = note1[j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if((!isVisited[i][j]) && map[i][j] == 1){
                    home = 1;
                    dfs(i,j);
                    arr.add(home);
                    cnt++;
                }


            }
        }
        System.out.println(cnt);
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    static void dfs(int x, int y){
        isVisited[x][y] = true;

        for (int i = 0; i < dx.length; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>= 0 && ny >= 0 && nx < N && ny < N ){
                if((!isVisited[nx][ny]) && map[nx][ny] == 1){
                    home++;
                    dfs(nx, ny);

                }
            }
        }
    }
}