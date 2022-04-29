import java.util.*;

class JEL_1475 {  
	public static void main(String[] args) throws Exception {    
        Scanner sc = new Scanner(System.in); 
        String str = sc.next();
          
        int[] arr = new int[10]; 
        int answer = 1;
        for(int i=0; i<arr.length; i++) {
            arr[i] = 1;
        }
          
        for(int i=0; i<str.length(); i++) { 
            int target = Integer.parseInt(str.substring(i, i+1)); 
            if(target == 6 || target == 9) { 
                if(arr[6] <= 0 && arr[9] <= 0) { 
                    answer++; 
                    for(int j=0; j<arr.length; j++) {
                        arr[j]++;
                    } 
                    arr[6]--;
                }else { 
                    if(arr[6] >= 1) { 
                        arr[6]--;
                    }else {  
                        arr[9]--;
                    }
                }
            }else { 
                if(arr[target] <= 0) {
                    answer++; 
                    for(int j=0; j<arr.length; j++) {
                        arr[j]++;
                    }
                } 
                arr[target]--; 
            }
        } 
        System.out.println(answer);
    }
}
