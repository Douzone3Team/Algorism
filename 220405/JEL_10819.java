import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class JEL_10819 {
    static int n;
    static int[] num;
    static boolean[] visit;
    static int[] select;
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        num = new int[n];
        visit = new boolean[n];
        select = new int[n];

        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0);

        System.out.println(result);
    }

    public static void dfs(int count) {
        if(count==n){
            result = Math.max(getResult(), result);
            return;
        }
        for(int i=0; i<n; i++){
            if(!visit[i]){
                visit[i] = true;
                select[count] = num[i];
                dfs(count+1);
                visit[i] = false;
            }
        }
    }

    public static int getResult(){
        int sum=0;
        for(int i=0; i<n-1; i++){
            sum += Math.abs(select[i]-select[i+1]);
        }
        return sum;
    }
}
