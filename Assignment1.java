//*********************************************************************************************************
// Assignment 1         Author: Carlos Fernandez/L30031020
//
// Finds the weighted test score averages, finds the weighted assignment averages, 
// finds the master average between the two weighted averages.
//*********************************************************************************************************

public class Assignment1 {
	
	//-----------------------------------------------------------------------------------------------------
	// Prints weighted scores averages of test scores, assignment scores, and master average
	//-----------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double test = + ((75*0.10)+(95*0.2)+(85*0.25)+(55*0.25)+(65*0.10)+(70*0.10)) ; 
	double assignment = + ((55*0.05)+(65*0.10)+(65*0.15)+(60*0.25)+(55*0.25)+(50*0.20)) ;
	System.out.println("Test scores weighted average:"	+ test) ; 
	System.out.println("Assignment scores weighted average:" + assignment) ;
	System.out.println("Master average between the two wieghted averages:" + ((assignment + test) / 2)) ;

	}}