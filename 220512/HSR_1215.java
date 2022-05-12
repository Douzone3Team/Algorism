import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class HSR_1215 {
    static String[][] map = null;
    static Stack<String> stack = new Stack<>();
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;

        for (int test_case = 0; test_case < 10; test_case++) {
            T = Integer.parseInt(br.readLine());
            map = new String[8][8];
            cnt = 0;
            for (int i = 0; i < 8; i++) {
                map[i] = br.readLine().split("");
            }
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8 ; j++) {
                    if(j <= 8 - T){
                        palindromeRow(i, j, T);
                    }

                    if(i <= 8 -T){
                        palindromeCol(i, j, T);
                    }
                }
            }
            System.out.println("#" + (test_case + 1) + " " + cnt);
        }
    }
    static void palindromeRow(int y, int x, int length){
        for (int i = 0; i < length / 2 ; i++) {
            stack.push(map[y][x + i]);
        }
        if (length % 2 == 1){
            for (int i = length / 2 + 1; i < length ; i++) {
                if(!stack.pop().equals(map[y][x+i])) {
                    stack.clear();
                    return;
                }
            }
        } else {
            for (int i = length / 2; i < length ; i++) {
                if(!stack.pop().equals(map[y][x+i])) {
                    stack.clear();
                    return;
                }
            }
        }
        cnt ++;
    }
    static void palindromeCol(int y, int x, int length){
        for (int i = 0; i < length / 2 ; i++) {
            stack.push(map[y + i][x]);
        }
        if (length % 2 == 1){
            for (int i = length / 2 + 1; i < length ; i++) {
                if(!stack.pop().equals(map[y+ i][x])) {
                    stack.clear();
                    return;
                }
            }
        } else {
            for (int i = length / 2; i < length ; i++) {
                if(!stack.pop().equals(map[y + i][x])) {
                    stack.clear();
                    return;
                }
            }
        }
        cnt ++;
    }
}
