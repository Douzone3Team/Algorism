package algorism;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class UCR_1213 {	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int test =0; test<10; test++) {
			int t = Integer.parseInt(br.readLine()); 
			String find = br.readLine(); 
			String str = br.readLine(); 
			int count = 0; 
			
			for(int i = 0; i <= str.length()-find.length(); i++) {
				if(find.equals(str.substring(i, i + find.length()))) {
					count++;
				}
			}
			
			System.out.println("#" + t + " " +count);
		}	
		br.close();
	}
}