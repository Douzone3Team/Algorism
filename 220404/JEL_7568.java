public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();   
		int arr[][] = new int[n][3]; 
		
		for(int i=0;i<n;i++) {  
			arr[i][0]= sc.nextInt();
			arr[i][1]= sc.nextInt();
		}
		
		int count;  
		for(int i=0;i<arr.length;i++) { 
			count =0;
			for(int j=0;j<arr.length;j++) { 
				if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]) {   
					count++; 
				}
			}
			
			arr[i][2]=count+1; 
		}
		
		for(int i=0;i<arr.length;i++) { 
			System.out.print(arr[i][2]+" ");
		}
	}
	
}
