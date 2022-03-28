import java.util.Scanner;

public class JEL_Baekjoon2810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		String seat = sc.next();
		String sTem = seat;
		
		sTem = sTem.replace("S", "*S*");
		sTem = sTem.replace("LL", "*LL*");
		/*******************************************/
//		sTem = sTem.replaceAll("\\*\\*", "*");
		sTem = sTem.replace("**", "*"); //두 개 겹칠 수 X
		
		int count = 0;
		for(int i=0; i < sTem.length(); i++) {
			if(sTem.charAt(i) == '*') { count++; }
		} 
		
		if(seat.length() < count) {
			System.out.println(seat.length());
		} else { System.out.println(count); } 
	}
} 
