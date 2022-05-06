package algorithm_220504;

import java.util.Scanner;

public class Swea_1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Test = 10;
		int i;
		for (i = 0; i < Test; i++) {
			
			int w_building = sc.nextInt();
			int[] building = new int[w_building];
			int result=0;
			int max_building=0;
			for (int j = 0; j < w_building; j++) {
				building[j] = sc.nextInt();
			}
			
			for (int j = 2; j < building.length-2; j++) {
				max_building = Math.max(building[j-1], Math.max(building[j-2],Math.max(building[j+1], building[j+2])));
				if(building[j]>max_building) {
					result += building[j] - max_building; 
				}
			}
			
			System.out.println("#"+ (i+1) + " " + result);
			
		}
	}
}
