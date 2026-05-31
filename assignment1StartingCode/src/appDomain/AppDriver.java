package appDomain;

import java.util.Comparator;

/**
 * <p>
 * This application driver code is designed to be used as a basis for the
 * Complexity and Sorting assignment that will be developed in the CPRG304 
 * class at SAIT. The implementors of this applications will be required
 * to add all the correct functionality.
 * </p>
 */
public class AppDriver
{
	/**
	 *  The main method is the entry point of the application.
	 *  @author Prithvi, Dmytro
	 *  @param args The input to control the execution of the application.
	 */
	
	public static void main( String[] args )
	{
		
		// refer to demo00 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)
		

		//Comparator<Shape> shapeComparator = chooseCopmarator(args[0]);
		// replaced line above with default comparator to avoid out of bounds error when no arguments are provided & if whatever after '-t' is not provided or is invalid, it will default to the default comparator
		Comparator<Shape> shapeComparator = new DefaultComparator();
		for (String arg : args) {
			 // Handle case-insensitivity
		
		    String lowerArg = arg.toLowerCase();
		    //read "t' before reading choice for compare type 'h', 'v', 'a'
		    if (lowerArg.startsWith("-t")) {
		    	//read the compare type choice 'h' v' a' after 't'
		   	 String compareType = lowerArg.substring(2); 
		   	 //uses the switch case to choose the correct comparator based on the compare type choice
		   	shapeComparator = chooseCopmarator(compareType);
		   	}
		    }}
	
	public static Comparator<Shape> chooseCopmarator(String compType) {

        switch (compType) {
            case "h":
				return new HeightComparator();
                
            case "v":
               
                return new VolumeComparator();
            case "a":
               
                return new BaseAreaComparator();

            
        }

		return new DefaultComparator();
    }   


}
