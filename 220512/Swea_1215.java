package algorithm_220512;

import java.util.Scanner;

public class Swea_1215 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[][] palind;
		int i;
		for (i = 0; i < 10; i++) {
			int num = sc.nextInt();
			
			palind = new char[8][8];
			
			for (int j = 0; j < 8; j++) {
				String s = sc.next();
				for (int k = 0; k < 8; k++) {
					palind[j][k] = s.charAt(k);
				}
			}
			boolean flag;
			int cnt = 0;
			for (int j = 0; j < 8; j++) { //row
				for (int k = 0; k < (8-num+1); k++) {
					flag = true;
					for (int h = 0; h < num/2; h++) {
						if(palind[j][k+h] != palind[j][k+num-1-h]) {
							flag = false;
						}
					}
					if(flag) cnt++; 
				}
			}
			
			for (int j = 0; j < 8; j++) { //row
				for (int k = 0; k < (8-num+1); k++) {
					flag = true;
					for (int h = 0; h < num/2; h++) {
						if(palind[k+h][j] != palind[k+num-1-h][j]) {
							flag = false;
						}
					}
					if(flag) cnt++; 
				}
			}
			
			
			System.out.println("#"+(i+1)+ " " + cnt);
		}
	}
}
