import java.util.*;

public class JEL_1120 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int result = a.length();

        for(int i=0;i<b.length()-a.length()+1;i++){
            int tmp=0;

            for(int j=0;j<a.length();j++){
                if(a.charAt(j)!=b.charAt(j+i)){
                    tmp++;f
                }
            }
            if(result > tmp){
                result = tmp;
            }
        }

        System.out.println(result);
    }
}