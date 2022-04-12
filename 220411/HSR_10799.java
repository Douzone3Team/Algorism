import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class HSR_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        String input = br.readLine();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '('){ stack.push(i); }
            else {
                if(stack.pop() == i-1) // 서로 인접한 경우.
                    result+=stack.size();
                else // 아닌 경우
                    result+=1;
            }
        }
        System.out.println(result);

    }
}

