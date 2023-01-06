Test 3

-> Difference b/w ArrayList and LinkedList 

	ArrayList - Read operation is easy in ArrayList
	LinkedList - Read operation is not easy in LinkedList
	
	ArrayList - Updating(Write operation) the data is not faster in ArrayList
	LinkedList - Updating(Write operation) the data is faster when compared to ArrayList
	
	ArrayList - Internally it makes use of an array
	LinkedList - Internally it makes use of nodes
	
	
-> Your task is to make two 
	

public class FindMaximumAndMinimum {
	
	public static void toFindMaximumAndMinimum(int a[]) {
		
		int min = a[0];
		int max = a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i] > max) {
				max = a[i];
			}
			else if(a[i] < min) {
				min = a[i];
			}
		
		}		
		
		System.out.println("The Maximum number is " + max);
		System.out.println("The Minimum number is " + min);
		
	}

	public static void main(String[] args) {
		
		int a[] = {45, 333, 76, 29, 900, 23, 474, 654, 29, 454};
		toFindMaximumAndMinimum(a);
		
		
		
		
-> Difference b/w ListIterator and Iterator
	ListIterator - It is used to access the values forward and backward direction
	Iterator - It is used to access the values only in forward direction
	
	ListIterator - It is available in List
	Iterator - available in collection class
	

-> Difference b/w static Polymorphism and dynamic Polymorphism
	static polymorphism - which is also known as compile time polymorphism or methodOverloading
	dynamic polymorphism - which is also known as run time polymorphism or methodOverriding
	
	static polymorphism - method which is declared more than once with the same name but difference in the parameter list
	dynamic polymorphism - method signature must be same but difference in the implementation 
		
		
->Which Sorted Collection have you used
		Sorting can be done by using Comparable<> and comparator

-> -What are some alternatives to inheritance

   -I don't want my class to be inherited by any other class. What should i do?
		Then u can make class as private
		
   -Can u give a few examples of final classes defined in Java API

->What is memory leakage in java

-> What is the convariant method for methodOverriding

-> What are the generalized and specialized classes in Java
		generalized - super class, Parent class, Base class(The class which is inherited)
		specialized - sub class, child class, Derived class(The class which inherits from another class)
		
->Hema created a class called PersonalInformation and she want to give security for the properties how can she achieve
		she can achieve it by using Encapsulation where data can be secured.