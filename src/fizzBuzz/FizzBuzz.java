package fizzBuzz;

public class FizzBuzz {

//	FizzBuzz: Output numbers from 1 to x.  
//	If the number is divisible by 3 replace it with "Fizz". 
//	If it is divisible by 5 replace it with "Buzz".  
//	If it is divisiable by 3 and 5 replace it with "Fizz Buzz".

//	e.g.
//	1
//	2
//	Fizz
//	4
//	Buzz
//	Fizz
//	....
	
	public static void main(String[] args) {
		fizzBuzz(0);
	}
	

	private static void fizzBuzz(int x) {
		for (x = 1; x <= 100; x++) {
			for (int i = 1; i <= x; i++) {
				if (i % 3 == 0 && i % 5 == 0)
					System.out.println("Fizz Buzz");
				else if (i % 3 == 0)
					System.out.println("Fizz");
				else if (i % 5 == 0)
					System.out.println("Buzz");
				else
					System.out.println(i);
			}
		}
	}
}
