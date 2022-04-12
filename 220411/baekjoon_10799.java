package coding_220411;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String gwalho = br.readLine();
		Stack<Character> ch = new Stack<Character>();
		int cnt=0;
		for (int i = 0; i < gwalho.length(); i++) {
			if(gwalho.charAt(i) == '(') {
				ch.push(gwalho.charAt(i));
			}//if end
			else if(gwalho.charAt(i) == ')') {
				ch.pop();
				if(gwalho.charAt(i-1) == '(') {
					cnt += ch.size();
				}
				else {
					cnt++;
				}
			}//else if end
		}//for end
		System.out.println(cnt);
	}//main end
}//class end
