package Practice;

import java.util.Scanner;

public class B {
	
	String firstname;
	String lastname;
	
	B(String a, String b){
		firstname =a;
		lastname =b;
	}
public void getFirstName(String a ){
	
	System.out.println(firstname);
}
			
	public void getlastName(String b) {
		System.out.println(lastname);
	}
	
	public static void main(String[] args) {
		
		B obj = new B("Ateeb", "Faruq");
		B obj1 = new B("Ami", "PAri");
	
		
		// TODO Auto-generated method stub
		/*A nonnegative integer is called a palindrome if it reads forward and backward 
		 * in the same way. For example, the numbers 5, 121, 3443, and 123454321 are palindromes.
		 *  Write a method that takes as input a nonnegative integer and returns  
		 *  the number is a palindrome.*/
		 

		
		/*Write a program in Java to display the n terms of odd natural number and their sum.
		Test Data
		Input number of terms is: 5
		Expected Output :
		The odd numbers are : 1 3 5 7 9 
		The Sum of odd Natural Number upto 5 terms is: 25     (Tamanna)*/

		/*Write a program to calculate  the sum of following series where n 
		 * is input by user. 1 + 1/2 - 1/3 + 1/4 - 1/5 +…………1/n
		 */
		
		/*Write a Java program to calculate the modules of two numbers without 
		using any inbuilt modulus operator.

		Test data:
		Sample 1:
		Input the first number : 5
		Input the second number: 3
		Output:
		2
		Sample 2:

		Input the first number : 19
		Input the second number: 7
		Output:5*/
		
		/*Write a program that asks the user to enter seconds as integer. 
		The program should compute and display the number of hours, number of minutes and 
		number of seconds in that seconds.
		For example if user enters 4205 seconds. The answer should be 
		Hours : 1
		Minutes : 10
		Seconds : 5*/
		/*Two numbers are entered  through the keyboard. Write a program to find the value 
		 * of one number raised to  the power of another.(Do not use Java built-in method)*/

		
			/*Write a Java class Author with following features:
			Instance variables :
			firstName for the author’s first name of type String.
			lastName for the author’s last name of type String.
			Constructor:
			A constructor with parameters, it creates the Author object by setting 
			the two fields(firstName, lastName) to the passed values.

			And Create two methods for getting the information about author
			getFirstName(): This method returns the first name of the author.
			getLastName(): This method display the last name of the author.*/

	/*Write a program to print out all Armstrong numbers between 1 and 500.
	 *  If sum of cubes of each digit of the number is equal to the number itself, 
	 *  then the number is called an Armstrong number.
	 
		For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )*/
	/*Write a Java program to reverse a string without using the reverse method 
	of Java’s String class*/


	/*	Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int second = input.nextInt();*/
		/*System.out.print("Enter 2nd number:");
		int b = input.nextInt();*/
		
	/*	int divide = a/b;
		int result = (a-(divide*b));
		System.out.println(result);*/
		
	/*	double sum= 0.0;
		for(int i=1; i<=n; i++) {
			sum= sum + (double)1/i;
			
		}System.out.print(sum);
		
	/*	int num=0;
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			
			num= (i*2-1);
			System.out.println(num);
			
			sum = sum+i;
		}System.out.println("sum of natural number:"+sum);*/
		
		
		
}
}

		
	
		
		
		

	


