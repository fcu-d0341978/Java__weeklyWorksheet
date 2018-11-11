/**
 * Write your javadoc comments for each methods
 * and generate your API.
 */
 
public class Person
{
	private String name;
	private int age;
 	private static int population = 0;
	
	//Declare a static method 
	public static int getPopulation()
	{
		return population;
	}
	
	//Default constructor
	public Person()
	{
		name = " ";
		age = 0;
		population++;
	}
	
	//Constructor taking two parameters
	public Person(String nameIn, int ageIn)
	{
		name = nameIn;
		age = ageIn;
		population++;
	}
	
	public void setName(String nameIn)
	{
		name = nameIn;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public boolean isOlder(Person other)
	{
		return getAge() > other.getAge();
	}
	
	public String toString()
	{
		String state = "Name: " + getName() + "\n"
				   	 + "Age : " + getAge();
		return state;
	}
}