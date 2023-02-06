package array;

public class ArrayInsertElement {

	public static void main(String[] args) {
		int array[]= {1, 2, 3, 5};
		
		int index = 2;
		int location = 3;
		int value = 4;
		System.out.println("Before add the element: ");
		for(int i =0; i <array.length; i++) {
			System.out.println(array[i]);
		}
		
		//logic
		
		for(int i = array.length; i>location-1; i++) {
			
			array[i] = array[i-1];
			
		} array[location]=value;
		System.out.println("After add the element: ");
		
		for(int i =0; i <array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
