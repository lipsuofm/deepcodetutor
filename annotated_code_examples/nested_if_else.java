/**
 * topics: nested if-Else 
 * subtopics: nested if-ELse 
 * goalDescription: Check whether a number is Even  or Odd number less than or equal to or greter than 10.
 * source: N/A
 * input: N/A
 * output: 8 is even number less than 10
 */
public class EvenOdd {
	public static void main(String[] args) {

		/**
		 * domain_model_question: What is the goal of the following block of code?
		 * logical_step_1: It declares a variable to store a number to check if a number is even or odd number greater than or less than or equal to 10
		 * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
		 * logical_step_details: A variable num of integer type is declared to store the number to be checked with different if conditions. In this block variable num is assigned to value 8.
		 * question_1: Why is variable num declared and what is its data type?
		 * answer_1: A variable num of integer type is declared to store the number to be checked for given conditions. 
		 * question_2: What value is the variable num initialized to?
		 * answer_2: The variable num is initialized to the integer value 8.
		 */

		int num = 8;
		/**
		 * domain_model_question: What is the goal of the following block of code?
		 * logical_step_2: It performs a test to check if the number is even number or odd number less than equal or greater than 10 and prints the given statement.
		 * program_model_question: Can you explain in detail how the goal of the current block of code is actually implemented?
		 * logical_step_details: The code block uses boolean expression to check if the number is less than equal to  10 or greater than 10. To check whether a number is even or odd, the remainder of the number divisible by 2 is calculated using the remainder % operator. The number is even if the remainder is 0, otherwise, it is odd. 
		 * question_1: How does the code check whether the number is even or odd?
		 * answer_1:  To check whether a number is even or odd, the remainder of the number divisible by 2 is calculated using the remainder % operator.
		 * question_2: When is the number even or odd based on the remainder operation's result?
		 * answer_2: The number is even if the remainder is 0, otherwise, it is odd.
		 * question_3: What happens if number is less than 10 in the following block of code?
		 * answer_3: If the number is less than 10, the code block checks if the number is even or odd.
		 * question_3: What is printed to the standard output when num is 12?
		 * answer_3: In this case, the program prints "12 is even number greater than 10".
		 */
		/**
		 * stm_comment: The code block inside the then branch of the if statement executes when the condition evaluates to true, which is the case in this example. 
		 * question_1: What happens if the condition of the first if statement is true?
		 * answer_1: The code block inside the if statement checks if the number is less than 10 or not.
		 * question_2: What happens if the condition of the second if statement is true?
		 * answer_2: The code block inside the if statement prints "8 is even number less than or equal to 10".
		 */

		if (num <= 10) {
			if (num%2==0) {
				System.out.println(num + " is even number less than or equal to 10");
			} else {
				System.out.println(num + " is odd number less than or equal to 10");
			}
			
		}
		else{
		    if (num%2==0) {
				System.out.println(num + " is even number greater than 10");
			} else {
				System.out.println(num + " is odd number greater than 10");
			}
		}
		

	}
}
