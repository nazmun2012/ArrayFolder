package Practice;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// count words
		/*String s= "i can do it.";
		int count=1;
		
		for(int i =0; i<=s.length()-1; i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}	
		}
		
		
		System.out.println(count);*/
		
					
			
		/*int arr []= {1,2,3};
		int reminder = 1;
		int reverse=0;
		
		for(int i=arr.length-1; i>=0; i--) {
			
			reminder= arr[i]%10;
			reverse = reverse*10+reminder;
			arr[i] = arr[i]/10;
		}System.out.println(reverse);*/
		
		
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i;j--) {
				System.out.print(" ");	
			}
			for(int k=1;k<=i; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	
	}

}
