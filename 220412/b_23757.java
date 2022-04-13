package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class b_23757 {

	public static void main(String[] args) throws IOException {	
		// Priority Queue: 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조
		// (큐가 들어가는 원소는 비교가 가능한 기준이 있어야함)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int []gift = new int[N];
		int []child = new int[M];
		
		// 선물
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {	
			pq.add(Integer.parseInt(st.nextToken()));
		}
//		System.out.println();
//		System.out.println(pq);
		
		// 아이가 원하는 값
		boolean flag = true;
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < M; i++) {
			int c = Integer.parseInt(st.nextToken());
			if(pq.peek() >= c) {
				pq.add(pq.peek() - c);
				pq.remove(pq.peek());
			}else {
				flag = false;
			}
			
		}
		
		if(flag == true) System.out.println(1);
		else System.out.println(0);

	}

}
