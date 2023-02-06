package array;

public class ArrayremoveElement {

	public static void main(String[] args) {
		//int array[] = {1, 2, 3, 4, 5};
		
	/*	int index = 4;
		int location =4;
		int value = 4;
		
		for (int i =0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("After remove: ");
			for(int i = index; i>location; i--) {
				array[i] =array[i-1];
				
			}array[location]=value;
			for (int i =0; i< array.length; i++) {
				System.out.println(array[i]);
			}*/
		// easy way to insert element
			int array[]= {1, 2, 3, 4, 5, 6};
			
			int index=2;
			int element=6;
		
			
			for(int i = 0; i<array.length; i++) {
				if(index==i) {
					array[i]= element;
				}
			} for(int i = 0; i<array.length; i++) {
				System.out.println(array[i]);
			}
			
	}

}
