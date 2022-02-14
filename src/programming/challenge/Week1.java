package programming.challenge;

import java.util.Scanner;

public class Week1 {

	  public static void main(String[] args) {
	        sumOfTwoDigits();
	    }

	    public static void sumOfTwoDigits() {

	        Scanner input = new Scanner(System.in);

	        System.out.println("number 1: ");
	        int number1 = input.nextInt();

	        System.out.println("number 2:");
	        int number2 = input.nextInt();

	        int result = number1 + number2;

	        System.out.println(result);
	    }

}