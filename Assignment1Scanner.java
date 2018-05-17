import java.util.Scanner;

//*********************************************************************************************************
// Assignment 1 with scanner tool        Author: Carlos Fernandez/L30031020
//
// Using the scanner tool we find the weighted test score averages, find the weighted assignment averages, 
// and find the master average between the two weighted averages.
//*********************************************************************************************************

public class Assignment1Scanner {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		//first we find the weighted test scores via user input, user must input scores and weighting
		
		int score1 = 0;
		double weight1 = 0;
		
		System.out.print("Enter 1st Test score: ");
		score1 = s.nextInt();
		System.out.print("Enter 1st Test weighting: ");
		weight1 = s.nextDouble();
				
				
		System.out.println("Your 1st weighted Test score is: "+(score1 * weight1)) ;
	
		int score2 = 0;
		double weight2 = 0;
		
		System.out.print("Enter 2nd Test score: ");
		score2 = s.nextInt();
		System.out.print("Enter 2nd Test weighting: ");
		weight2 = s.nextDouble();
						
		System.out.println("Your 2nd weighted Test score is: "+(score2 * weight2)) ;
	
		int score3 = 0;
		double weight3 = 0;
		
		System.out.print("Enter 3rd Test score: ");
		score3 = s.nextInt();
		System.out.print("Enter 3rd Test weighting: ");
		weight3 = s.nextDouble();
				
				
		System.out.println("Your 3rd weighted Test score is: "+(score3 * weight3)) ;
	
		int score4 = 0;
		double weight4 = 0;
		
		System.out.print("Enter 4th Test score: ");
		score4 = s.nextInt();
		System.out.print("Enter 4th Test weighting: ");
		weight4 = s.nextDouble();
				
				
		System.out.println("Your 4th weighted Test score is: "+(score4 * weight4)) ;
	
		int score5 = 0;
		double weight5 = 0;
		
		System.out.print("Enter 5th Test score: ");
		score5 = s.nextInt();
		System.out.print("Enter 5th Test weighting: ");
		weight5 = s.nextDouble();
				
				
		System.out.println("Your 5th weighted Test score is: "+(score5 * weight5)) ;
	
		int score6 = 0;
		double weight6 = 0;
		
		System.out.print("Enter 6th Test score: ");
		score6 = s.nextInt();
		System.out.print("Enter 6th Test weighting: ");
		weight6 = s.nextDouble();
				
				
		System.out.println("Your 6th weighted Test score is: "+(score6 * weight6)) ;
	
		System.out.println("Your weighted Test score average is: "+((score1 * weight1)+(score2 * weight2)+(score3 * weight3)+(score4 * weight4)+(score5 * weight5)+(score6 * weight6))) ;
		
		
		//Now we find the assignment weighted test scores via user input, user must input scores and weighting
		

		int score7 = 0;
		double weight7 = 0;
		
		System.out.print("Enter 1st Assignment score: ");
		score7 = s.nextInt();
		System.out.print("Enter 1st Assignment weighting: ");
		weight7 = s.nextDouble();
				
				
		System.out.println("Your 1st weighted Assignment score is: "+(score7 * weight7)) ;
	

		int score8 = 0;
		double weight8 = 0;
		
		System.out.print("Enter 2nd the Assignment score: ");
		score8 = s.nextInt();
		System.out.print("Enter 2nd the Assignment weighting: ");
		weight8 = s.nextDouble();			
				
		System.out.println("Your 2nd weighted Assignment score is: "+(score8 * weight8)) ;
	
		int score9 = 0;
		double weight9 = 0;
		
		System.out.print("Enter 3rd Assignment score: ");
		score9 = s.nextInt();
		System.out.print("Enter 3rd Assignment weighting: ");
		weight9 = s.nextDouble();
						
		System.out.println("Your 3rd weighted Assignment score is: "+(score9 * weight9)) ;
	
		int score10 = 0;
		double weight10 = 0;
		
		System.out.print("Enter 4th Assignment score: ");
		score10 = s.nextInt();
		System.out.print("Enter 4th Assignment weighting: ");
		weight10 = s.nextDouble();
				
				
		System.out.println("Your 4th weighted Assignment score is: "+(score10 * weight10)) ;
	
		int score11 = 0;
		double weight11 = 0;
		
		System.out.print("Enter 5th Assignment score: ");
		score11 = s.nextInt();
		System.out.print("Enter 5th Assignment weighting: ");
		weight11 = s.nextDouble();
				
				
		System.out.println("Your 5th weighted Assignment score is: "+(score11 * weight11)) ;
	
		int score12 = 0;
		double weight12 = 0;
		
		System.out.print("Enter 6th Assignment score: ");
		score12 = s.nextInt();
		System.out.print("Enter 6th Assignment weighting: ");
		weight12 = s.nextDouble();
	
		s.close();
				
		System.out.println("Your 6th weighted Assignment score is: "+(score12 * weight12)) ;
	
		System.out.println("Your weighted Assignments score average is: "+((score7 * weight7)+(score8 * weight8)+(score9 * weight9)+(score10 * weight10)+(score11 * weight11)+(score12 * weight12))) ;
		
		System.out.println("Your weighted Test and Assignments scores average is: "+(((score1 * weight1)+(score2 * weight2)+(score3 * weight3)+(score4 * weight4)+(score5 * weight5)+(score6 * weight6)+(score7 * weight7)+(score8 * weight8)+(score9 * weight9)+(score10 * weight10)+(score11 * weight11)+(score12 * weight12))/2)) ;
		
		
	}}		