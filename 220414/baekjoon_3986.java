package coding_220414;

import java.util.Scanner;
import java.util.Stack;

public class baekjoon_3986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<Character> stack = new Stack<Character>();
		int goodWords = 0;

		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				if (!stack.isEmpty() && str.charAt(j) == stack.peek())
					stack.pop(); // 현재 문자의 값과 stack의 top 값이 같을경우 => 짝을이루어 제거
				else
					stack.push(str.charAt(j)); // 두 문자가 다를경우 => 스택에 쌓기.
			}
			// 모든 A, B가 짝이 맞을경우 -> 좋은단어
			if (stack.size() == 0)
				goodWords++;

			stack.clear(); // 스택 초기화
		}

		System.out.println(goodWords);
	}

}
