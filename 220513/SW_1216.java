import java.util.*;

public class SW_1216 {
	static Scanner sc = new Scanner(System.in);
	static String[] arr = new String[8];
	static int len = 0;

	static boolean isT(String test) {
		boolean check = true;
		int len = test.length();
		for (int i = 0; i < len / 2; i++) {
			if (test.charAt(i) != test.charAt(len-i-1)) {
				check = false;
				break;
			}
		}
		return check;
	}

	static int getRow(int row) { 
		int answer = 0;
		String tmp = arr[row];
		for (int i = 0; i <= tmp.length()-len; i++) {
			if (isT(tmp.substring(i, i + len))) { answer++; }
		}
		return answer;
	}

	static int getCol(int col) { 
		int answer = 0;
		String temp = "";
		for (int i = 0; i < 8; i++) {
			temp += arr[i].charAt(col);			
		}

		for (int i = 0; i <= temp.length() - len; i++) {
			if (isT(temp.substring(i, i + len)))
				answer++;
		}
		return answer;
	}

	static void solv() {
		for (int i = 1; i <= 10; i++) {
			int sum = 0;
			len = sc.nextInt();
			for (int j = 0; j < 8; j++) {				
				arr[j] = sc.next();
			}

			for (int j = 0; j < 8; j++) {
				sum += (getRow(j) + getCol(j));				
			} 
			System.out.println("#" + i + " " + sum);
		}
	} 
	public static void main(String[] args) { 
		solv();
	} 
}
