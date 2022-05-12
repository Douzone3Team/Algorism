import java.util.*;

public class SW_1215 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		for(int t = 1; t <= 10; t++) {
			char[][] a = new char[8][8];
			int n = sc.nextInt();
			int count = 0;
			for(int i = 0; i < 8; i++) {
				String str = sc.next();
				for(int j = 0; j < 8; j++) {
					a[i][j] = str.charAt(j);
				}
			}
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8 - n + 1; j++) {
					char[] c = new char[n];
					for(int k = 0; k < n; k++){
						c[k] = a[i][j+k]; 
					}
					int flag = 0;
					for(int k = 0; k < n/2; k++) {
						if(c[k] != c[n-k-1]) {
							flag = 1;
							break;
						}
					}
					if(flag == 0) { count++; }
				}
			}
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8 - n + 1; j++) {
					char[] c = new char[n];
					for(int k = 0; k < n; k++){
						c[k] = a[j+k][i]; 
					}
					int flag = 0;
					for(int k = 0; k < n/2; k++) {
						if(c[k] != c[n-k-1]) {
							flag = 1;
							break;
						}
					}
					if(flag == 0) { count++; }  
				}
			}
			System.out.println("#" + t + " " + count);
		}
	}
}
