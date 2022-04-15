import java.io.*;
import java.util.*;

public class JEL_3986 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
    for(int i = 0; i < n; i++) {
			String line = br.readLine();
			Stack<Character> stack = new Stack<>();
			
			for(int j = 0; j < line.length(); j++) {
				if(stack.size() > 0 && stack.peek() == line.charAt(j)) {
					stack.pop();
				} else {
					stack.push(line.charAt(j));
				}
			}
			if(stack.size() == 0) {
        count++;
      }
    }
		System.out.println(count);
	}
}
