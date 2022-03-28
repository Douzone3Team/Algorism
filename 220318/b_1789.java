package baekjoon;

import java.util.*;

public class b_1789 {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	
    	long S = sc.nextLong();
    	
    	int sum = 0, max=0;
    	int i = 1;
    	
    	while(true) {
    		sum += i ;
    		max++;
    		if(sum>S) {
    			max--;
    			break;
    		}
    		i++;
    	}
    	System.out.println(max);
 
    }
}

