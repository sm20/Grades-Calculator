/*
 SAJID CHOUDHRY
 10063503
 CPSC 233- Assignment 1- 
 L01-T03
 
 
 STUDENTS GRADE PROGRAM (v.2.0)
 January 29, 2016
 
 
 FEATURES
 
 v1.0
 This program uses a users grade integer input to provide statistics about the inputed grades.
 This program prompts the user to input their classes title. It then asks the user to enter the grades for the class,
 one at a time until all the grades have been entered, and a sentinel value of -1 or less to exit the grade entry is
 inputed. The program then displays the following statistics to the user:
 the class title, the number of grades entered, the maximum, minimum, average, and the sum of the grades entered.
 
 v2.0
 In addition, the number of students in each grade letter distribution are provided.
 
*/

import java.util.Scanner;


public class Grades {

	public static void main(String[] args) 
	{
		
		//Prompts the user for input and assigns the input to the String courseCode.
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the Course Code and and press Enter:");
		String courseCode = keyboard.nextLine();
		System.out.println("You entered: " + courseCode + "\n");
		
		//Declaration and initiation of variables.
		int grade = 0;
				
		int numberOfGrades = 0;
		int maxGrade = 0;
		int minGrade =100;
		double avgGrade = 0;
		int sumGrades = 0;
		
		int aGrade = 0;
		int aMinusGrade = 0;
		int bPlusGrade = 0;
		int bGrade = 0;
		int bMinusGrade = 0;
		int cPlusGrade = 0;
		int cGrade = 0;
		int cMinusGrade = 0;
		int dPlusGrade = 0;
		int dGrade = 0;
		int fGrade = 0;
		

		//gives a sentinel a value for controlling the loop below.
		int sentinel = 0;
		
		
	
		
		//Loop runs at least once and until a negative value is entered. 
		do
		
		{
				/*Prompts the user to enter an integer value between 0 and 100. If an integer value is not entered,
				 * the user is prompted again to enter an integer value.
				 * 
				 */
				System.out.println("Please enter a numeric grade between 0 and 100, inclusive, and press Enter:");
				while(!keyboard.hasNextInt())
				{
					
					System.out.println("Please enter a numeric grade between 0 and 100, inclusive, and press Enter:");
					keyboard.nextLine();
				}
				//Assigns the inputed value to the integer grade.
				grade = keyboard.nextInt();
				
				if((grade <=100) && (grade >= 0))
				{
					//Increments the value of one of the letter grade integers by one depending on the user entered integer. 
					{if(grade>=0 && grade<45)
						fGrade++;
					else if (grade>=45 && grade<50)
						dGrade++;
					else if (grade>=50 && grade<55)
						dPlusGrade++;
					else if (grade>=55 && grade<60)
						cMinusGrade++;
					else if (grade>=60 && grade<65)
						cGrade++;
					else if (grade>=65 && grade<70)
						cPlusGrade++;
					else if (grade>=70 && grade<75)
						bMinusGrade++;
					else if (grade>=75 && grade<80)
						bGrade++;
					else if (grade>=80 && grade<85)
						bPlusGrade++;
					else if (grade>=85 && grade<90)
						aMinusGrade++;
					else if (grade>=90 && grade<100)
						aGrade++;
					}
					/*Increments the integer numberOfGrades by one every time the user enters an appropriate input.
					 * It does not increment for values outside of the range of the loop.
					 * Inputed grades are summed
					 * Sentinel loop control stays at zero to allow additional inputs.
					 */
					numberOfGrades++;
					sumGrades += grade;
					sentinel = 0;
					
					//calculates and stores the maximum and minimum grades entered.
					if(maxGrade < grade)
						maxGrade = grade;
						
					if(minGrade > grade)
						minGrade= grade;
					
					
					
				}
				/* Provides an error message if the value entered is too large
				 * 
				 */
				else if(grade > 100)
				{
					
					System.out.println("The entered number was greater than 100. Please enter a number between 0 and 100 inclusive, "
							+ "or input a negative number to exit Grade entry");
					sentinel = 0;
				}
				//Exits the loop if the value entered is negative and allows the user to end Grade Input and view statistics.
				else if(grade <0)
				{
					grade = 0;//maybe?
					sentinel = -1;
					
				}

		}
		//Continues the loop until it is terminated
		while((grade >100) || (sentinel == 0));
		

		avgGrade = ((double)sumGrades/numberOfGrades);
		
				
		
				
		
		//Prints the following statistics after the user has entered a negative integer as input.
		System.out.printf("%n%nClass: %s", courseCode);
		
		System.out.printf("%n%n%s%n", "Your Statistics are as follows:");
		System.out.printf("%nSum of Grades: %d", sumGrades);
		System.out.printf("%nNumber of Grades Entered: %d", numberOfGrades);
		System.out.printf("%nClass Average Grade: %.2f", avgGrade);
		System.out.printf("%nMaximum Grade: %d", maxGrade);
		System.out.printf("%nMinimum Grade: %d", minGrade);
		
		System.out.printf("%n%n%s%n", "Breakdown of Grades (Number of Students in Each Category):");
		System.out.printf("%n%s%d", "A: ", aGrade);
		System.out.printf("%n%s%d", "A-: ", aMinusGrade);
		System.out.printf("%n%s%d", "B+: ", bPlusGrade);
		System.out.printf("%n%s%d", "B: ", bGrade);
		System.out.printf("%n%s%d", "B-: ", bMinusGrade);
		System.out.printf("%n%s%d", "C+: ", cPlusGrade);
		System.out.printf("%n%s%d", "C: ", cGrade);
		System.out.printf("%n%s%d", "C-: ", cMinusGrade);
		System.out.printf("%n%s%d", "D+: ", dPlusGrade);
		System.out.printf("%n%s%d", "D: ", dGrade);
		System.out.printf("%n%s%d", "F: ", fGrade);
		
		
	}

}
