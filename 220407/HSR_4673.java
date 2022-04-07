import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class HSR_4673 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 10000; i++) {
            String str = ""+i;
            list.add(str);
        }
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            String str = ""+i;
            sum += i;
            for (int j = 0; j < str.length(); j++) {
                sum +=Integer.parseInt(String.valueOf(str.charAt(j)));
            }
            if(list.contains(String.valueOf(sum))){
                list.remove(String.valueOf(sum));
            }
        }
        for(String item : list){
            System.out.println(item);
        }

    }
}

