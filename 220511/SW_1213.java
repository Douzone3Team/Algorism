import java.util.*;

public class SW_1213 { 
    static String test, m;
    static Scanner sc = new Scanner(System.in);
    
    static int getSubNum() {
        int answer = 0;
        int ml = m.length();
        for(int i = 0; i <= test.length()-ml; i++) {
            if(test.substring(i, i+ml).equals(m)) { answer++; }
        }
        return answer;
    }
    static void solv() {
        for(int i=1; i<=10; i++) {
            sc.nextInt(); m = sc.next(); test = sc.next();
            System.out.println("#"+i+" "+getSubNum());
        }
    }
 
    public static void main(String[] args) { 
    	solv();
    } 
} 
