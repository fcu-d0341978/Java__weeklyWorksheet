//A Client class demonstrate creating and using objects of Person 
import java.util.Arrays;
import java.util.Scanner;

public class TestPerson
{
   public static void main(String args[])
   {	
      Person[] group = new Person[3];
      
      group[0] = new Person("Lmao", 60);
      group[1] = new Person("Omegalul", 70);
      group[2] = new Person("MonkaS", 80);
      
		//Declare reference variable of type Person
	 	Person p1; 

		//Create object & store it in reference p1
		p1 = new Person("David Backham", 32); 
		
		//Invock static method
		System.out.println("Population is 1: " + Person.getPopulation());

		//Declare & create object in a signal step
		Person p2 = new Person("Emma Thompson", 24);

		//Access object’s data and methods
		int myAge = p1.getAge();
		System.out.println(p2.toString());
		System.out.println("P1 is older: " + p1.isOlder(p2));
		
		//Check population using class name
		System.out.println("Population is 2: " + Person.getPopulation());
		
		//Create object using the default constructor
		Person p3 = new Person("Jake lul", 25);
		
		//Check population using object
		System.out.println("Population is 3: " + p3.getPopulation());
		
		//Display the 3rd instance
		System.out.println("The 3rd person details:\n" + p3);	
      
      for (int i = 0; i < 3; i++)
      {
         System.out.println("The group details:\n" + group[i]);	
      }
      
      System.out.println(Month.getMonthNum(5));
   }
}