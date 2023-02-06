package array;

public class Array2DInitial {

	public static void main(String[] args) {
		
		int[][] a= {{1, 2, 3}, {3, 5, 6}, {7,8}};
		int row=3;
		int col=3; 
		
		for(row =0; row<a.length; row++) {
			for(col =0; col<a.length; col++) {
				
				System.out.print(a[row][col]+ " ");
				
			}System.out.println();
			
		}

	}

}
