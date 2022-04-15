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
					stack.pop(); // ���� ������ ���� stack�� top ���� ������� => ¦���̷�� ����
				else
					stack.push(str.charAt(j)); // �� ���ڰ� �ٸ���� => ���ÿ� �ױ�.
			}
			// ��� A, B�� ¦�� ������� -> �����ܾ�
			if (stack.size() == 0)
				goodWords++;

			stack.clear(); // ���� �ʱ�ȭ
		}

		System.out.println(goodWords);
	}

}
