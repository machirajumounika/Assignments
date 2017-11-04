
/**
* The  program implements an application that
* simply displays Name to the standard output.
*
* @author  Mounika Machiraju
* @version 1.0
* @since   2017-11-04 
*/
package com.assignment.assignment1;
public class Assignment {

	public void printName(String name) {
		System.out.println("You have entered your name as " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment assignemnt = new Assignment();
		
		assignemnt.printName("Ram");
		assignemnt.printName("Sham");
		assignemnt.printName("Steve");
		assignemnt.printName("Tim");

	}

}
