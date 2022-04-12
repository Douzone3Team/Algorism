package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class b_10799 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String input = sc.nextLine();
			Stack<Character> stack = new Stack<Character>();
			
			int count1 = 0 , count2 = 0 , stick = 0;
	
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if(c == '(') {
					stack.push(c);
					count1++;
					
				}else if(c == ')') {
					count1--;
					if(stack.peek() == '(') {
						stack.push(')');
						count2 += count1;
					}else {
						stack.push(')');
						stick++;
						
					}
				
			}

		}
		System.out.println("stick: "+ stick+", count1: "+count2);
		System.out.println(stick+count2);
	}

}
