import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HSR_7569 {
    static int[][][] map;
    static boolean[][][] isVisible;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M, N, H;
        int[] note;
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][M][N]; isVisible = new boolean[H][M][N];


        for (int i = 0; i < H; i++) {
            for (int j = 0; j < M; j++) {
                note = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                for (int k = 0; k < N; k++) {
                    map[i][j][k] = note[k];
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    System.out.print(map[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}