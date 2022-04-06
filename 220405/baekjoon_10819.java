package coding_220405;

import java.io.IOException;
import java.util.Scanner;

public class baekjoon_10819 {
	public static int n;
    public static int[] arr;
    public static int[] ans;
    public static boolean[] visit;
    public static int result;
    public static void dfs(int cnt){
        if(cnt == n) {
            int sum = 0;
            for(int i = 0; i < n-1; i++) {
                sum += Math.abs(ans[i] - ans[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }
        for(int i = 0; i < n; i++) {
            if(!visit[i]){
                ans[cnt] = arr[i];
                visit[i] = true;
                dfs(cnt + 1);
                visit[i] = false;
            }
        }
    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        ans = new int[n];
        visit = new boolean[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        dfs(0);
        System.out.println(result);
	}
}
