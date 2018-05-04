import java.util.Scanner;

public class Ch3Q3EstimatingHeight {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int count = 0;
		
		while (true)
		{	
			System.out.print("Please enter the gender of the child: (M/F) ");
			String gender = keyboard.next();
		
			System.out.print("Please enter the height of the mother in inches: ");
			double heightMother = keyboard.nextDouble();
		
			System.out.print("Please enter the height of the father in inches: ");
			double heightFather = keyboard.nextDouble();
		
			double heightMaleChild=0, heightFemaleChild=0;
		
			if (gender.equalsIgnoreCase("m") || gender.charAt(0)=='M' || gender.charAt(0)=='m')
			{
				heightMaleChild = ((heightMother*13/12)+heightFather)/2;
				int feet = (int)(heightMaleChild/12);
				int inch = (int)(heightMaleChild%12);
				System.out.print("\nThe height of the male child would be "
					+ feet 
					+ " feet "
					+ inch
					+ " inch.");
				count ++;
			}
			
			else if (gender.equalsIgnoreCase("f") || gender.charAt(0)=='F' || gender.charAt(0)=='f')
			{
				heightFemaleChild = ((heightFather*12/13)+heightMother)/2;
				int feet = (int)(heightFemaleChild/12);
				int inch = (int)(heightFemaleChild/12);
				System.out.print("\nThe height of the female child would be "
						+ feet
						+ " feet "
						+ inch
						+ " inch.");
				count++;
			}
			
			System.out.print("\n\nDo you want to repeat: (Y/N) ");
			String repeat = keyboard.next();
			
			if (repeat.equalsIgnoreCase("Y") || repeat.charAt(0)=='Y' || repeat.charAt(0)=='y')
			{
				System.out.println();
				continue;
			}
			else if (repeat.equalsIgnoreCase("N") || repeat.charAt(0)=='N' || repeat.charAt(0)=='n')
			{
				System.out.println("\nYou have played " + count + " times.");
				System.out.println("--------------------------------------------------------------");
				System.out.print("Thank you for using NuoJie's Child Height Estimate Power Tool!");
				keyboard.close();
				System.exit(0);
			}
			
		}

	}

}
