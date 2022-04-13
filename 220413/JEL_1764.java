import java.util.*;

public class JEL_1764 {
	 public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        Map<String, String> dutbo = new HashMap<>();
         
        while(N-- > 0) {
            String peop = sc.next();
            dutbo.put(peop, peop);
        } 
        
        List<String> dutboList = new ArrayList<>();
        
        while(M-- > 0) {
            String pers = sc.next();
            // 듣보인지 확인
            if(dutbo.get(pers) != null) {
            	dutboList.add(pers);
            }
        }
        System.out.println(dutboList.size());
        Collections.sort(dutboList);

        while(!dutboList.isEmpty()) {
            System.out.println(dutboList.remove(0));
        }
    }
}
