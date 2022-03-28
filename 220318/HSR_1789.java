package dailyAlgorism;


import java.util.Scanner;

public class HSR_1789 {	
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		long S = sc.nextLong();
		long N = 0;
		long sum = 0;		
		while(true) {
			sum +=N;			
			if(sum <= S) {
				N++;
			}
			else break;
			
		}		
		System.out.println(N-1);
	}	
	
	
}
