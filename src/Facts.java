import java.util.Scanner;



public class Facts {
	
	public static void main(String[] args) {

		System.out.println("enter a numer boy");

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		calc(num);

	}

	public static void calc(int num) {

		int counter = 1;

		int result;

		while (num % counter == 0) {

			num = num / counter;

			counter = counter + 1;

		}

		if (num == 1) {

			System.out.println("result is " + (counter - 1));

		}

		else {

			System.out.println("go home lad");

		}

	}



	}



/*
 * 
 * Factorials
 * 
 * Description
 * 
 * Most people are familiar with the factorial operator in math. 5! yields 120
 * because factorial means
 * "multiply successive terms where each are one less than the previous":
 * 
 * 
 * 5! -> 5 * 4 * 3 * 2 * 1 -> 120
 * 
 * 
 * Now let's reverse it. Could you write a function that tells us that "120" is
 * "5!"?
 * 
 * 
 * Hint: divide the term by successively larger terms until you get to "1" as
 * the resultant:
 * 
 * 
 * 120 -> 120/2 -> 60/3 -> 20/4 -> 5/5 -> 1 => 5!
 * 
 * 
 * Sample Input
 * 
 * You'll be given a single integer, one per line. Examples:
 * 
 * 
 * 120
 * 
 * 
 * 150
 * 
 * 
 * Sample Output
 * 
 * Your program should report what each number is as a factorial, or "NONE" if
 * it's not legitimately a factorial. Examples:
 * 
 * 
 * 120 = 5!
 * 
 * 
 * 150 NONE
 * 
 * 
 * Challenge Input
 * 
 * 3628800
 * 
 * 
 * 479001600
 * 
 * 
 * 6
 * 
 * 
 * 18​
 */