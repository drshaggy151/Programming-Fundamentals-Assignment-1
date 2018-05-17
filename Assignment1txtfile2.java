import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Assignment1txtfile2 {

	public static void main(String[] args) {
		
		String filename = "scores and weights";
		File file = new File(filename);
		try {
			Scanner inputStream = new Scanner(file);
			inputStream.next();
			double sum1 = 0;
			double sum2 = 0;
			while (inputStream.hasNext()) {
				String data = inputStream.next();
				String[] values = data.split(",");
				double testscores = Double.parseDouble(values[0]);
				double testweights = Double.parseDouble(values[1]);
				double assignmentscores = Double.parseDouble(values[2]);
				double assignmnetweights = Double.parseDouble(values[3]);
				double weightedtest = testscores * testweights;
				sum1 += weightedtest;			
				double weightedAssignment = assignmentscores * assignmnetweights;
				sum2 += weightedAssignment;
			}
			inputStream.close();
			System.out.println("Weighted Test scores average: " + sum1) ;		
			
			
			System.out.println("Weighted Assignment scores average: " + sum2) ;	
			
			
			System.out.println("Weighted Test and Assigment scores master average: " + ((sum1 + sum2)/2) ) ;
			
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
}}

