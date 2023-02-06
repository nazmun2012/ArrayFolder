package array;

public class IndexOfArray {

	public static void main(String[] args) {
		int index=0;
		int[] array= {1, 2, 3, 4, 5};
		for(int i= 0; i<array.length; i++) {
		 if(array[i]== 3) {
			 index=array[i];
			 
		 }
		 
		}System.out.println("Array index:"+index);
		/*int a[]=new int[5]; 
		a[0]=0;
		a[1]=1;
		a[2]=1;
		a[3]=2;
	    a[4]=4;  
	    for(int i=0; i<a.length; i++ ) {
	    	System.out.println(a[i]);
	}*/

}
}