package coding_220317;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baekjoon_2217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList<Integer>(n);
		while(n-->0){
			al.add(sc.nextInt());
		}
		Collections.sort(al,Collections.reverseOrder());
		
		int w = al.get(0);
		
		for (int i = 1; i < al.size(); i++) {
			w = Math.max(w, al.get(i)*(i+1));
		}
		System.out.println(w);
	}
}
