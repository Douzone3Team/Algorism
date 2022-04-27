import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class HSR_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        while(num-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            Stack<String> stack = new Stack();

            while(st.hasMoreTokens()){
                stack.add(st.nextToken());
            }

            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
            System.out.println(sb.toString());
        }



    }
}
