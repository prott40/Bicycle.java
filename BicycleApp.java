// BicycleApp Starter file given to the student
/**
* <BicycleApp.java>
* <Preston Rottinghaus/ 02B Thursday 3:30-5:30>
*
* <The BicycleApp hold the main method in which 4 Bicycle objects are created. the methods for setting gear and color are used by user to set bike[0] and new bike.
* the toString method is used to print out what each object holds>
*/
import java.util.*;

public class BicycleApp
{public static void main(String[] args)
  {	
	Scanner s = new Scanner(System.in);
	// declare an array of 4 Bicycle objects called 'bike'
Bicycle [] bike = new Bicycle [4] ;
	// Instantiate the 4 bike objects
	bike[0] = new Bicycle();	// call the default, no arg constructor
	bike[1] = new Bicycle(6);	// call the 1-arg constructor to create a bike in 6th gear
	bike[2] = new Bicycle("purple"); // call the 1-arg constructor to create a purple bike
	bike[3] = new Bicycle(3, "blue");	// call the 2-arg constructor to create a red bike in 10th gear

    // display initial state of all bicycles in the array using the toString method
for(int i = 0; i < bike.length;i++ ){
	System.out.println("Bike[" + i + "]\n" + bike[i].toString() + "\n");
}
	// Read in a new color and gear for bike[0] and
	// use the set methods to change the 'state' of bike
System.out.print("enter a new color bike[0]: ");
// call setColor method on bike[0]
String nc = s.nextLine();
bike[0].setColor(nc);
System.out.print("enter a new gear for bike[0]: ");
// call setGear method on bike[0]
int ng = Integer.parseInt(s.nextLine());
while(ng<=1 && ng>= 10){
	System.out.print("Invalid gear reenter: ");
	ng = Integer.parseInt(s.nextLine());
}
bike[0].setGear(ng);
System.out.println("Changing the gear and color of bike[0]...\n");

	
	
	

// display the current state of bike[0] only using the toString method
System.out.println(bike[0].toString());
// Part 2 - Create another bicycle object (newBike) that is NOT part of the array
Bicycle newBike = new Bicycle();
// User will enter the color and the gear
System.out.print("\nenter a color for newBike: ");

String nbc = s.nextLine();
newBike.setColor(nbc);
System.out.print("enter a gear for newBike: ");

int nbg = Integer.parseInt(s.nextLine());
newBike.setGear(nbg);
// Use a loop with the 'equals' method to determine if newBike is equal to any 
int mctr =0;
for(int i = 0; i < bike.length; i++){
	if(newBike.equals(bike[i])){
		mctr++;
	}
}
if( mctr>= 1){
	System.out.println("New Bike object matches a current bike in the array");
}
else{
System.out.println("New Bike object does NOT match a current bike in the array");
}
// of the other bikes in the array 
// If so, display "New Bike object matches a current bike in the array"
// oherwise display "New Bike object does NOT match a current bike in the array"

s.close();
  } //end of method main
} //end of class BicycleApp