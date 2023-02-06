package array;

public class DuplicateValue {

	public static void main(String[] args) {
		int []array= {1, 2, 2, 3, 3, 4, 4, 5};
		for(int i=0; i<array.length; i++) {
			for(int j=i; j<array.length; j++) {
				if (array[i]==array[j] &&(i!=j) ) {
					System.out.println("Duplicte value is : "+array[j]);
				}
			}
			
		}
		

	}

}
