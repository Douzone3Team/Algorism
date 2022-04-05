package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10819 {
  static int N, result;
  static int [] seq;
  static boolean [] visited;
  
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    // 입력부
    N = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    
    seq = new int [N];
    visited = new boolean[N];
    
    for (int i = 0 ; i < N ; i++) {
      seq[i] = Integer.parseInt(st.nextToken());
    }
    
    // 백트래킹 
    back(0, new int [N]);
    
    System.out.println(result);
  }
  
  static void back(int cnt, int [] res) {
    if (cnt == N) {
      int temp = 0;
      for (int i = 0 ; i < N-1 ; i++) {
        temp += Math.abs(res[i] - res[i+1]);
      }
      result = Math.max(result, temp);
    }
    
    for (int i = 0 ; i < N ; i++) {
      if (visited[i]) continue;
      visited[i] = true;
      res[cnt] = seq[i];
      back(cnt+1, res);
      visited[i] = false;
      res[cnt] = 0;
    }
  }
}