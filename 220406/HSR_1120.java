import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HSR_1120{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int cnt=0,min=Integer.MAX_VALUE;
        for (int i = 0; i <= B.length() - A.length(); i++) {
            cnt = 0;
            for (int j = 0; j < A.length(); j++) {
                if(A.charAt(j) !=B.charAt(j+i)){
                    cnt++;
                }
            }
            min = Math.min(min,cnt);
        }
        System.out.println(min);
    }
}