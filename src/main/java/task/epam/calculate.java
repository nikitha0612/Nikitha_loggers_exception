package task.epam;

import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		double principal = sc.nextDouble();
		System.out.println("Enter the rate of interest");
		double rateOfInterest = sc.nextDouble();
		System.out.println("Enter the time period");
		float time = sc.nextFloat();
		

			System.out.println("Enter 1 to calculate Simple Interest");
			System.out.println("Enter 2 to calculate Compound Interest");
		
			int choice = sc.nextInt();
			char ch;
			InterestCalculation i = new InterestCalculation();
		
			switch(choice) {
				case 1:
					LOGGER.info("Simple Interest : "+i.simple_interest(principal, time, rateOfInterest));
				    break;
					
				case 2:
					System.out.println("Enter number of times to be compounded");
					int num = sc.nextInt();
					LOGGER.info("Compound Interest : "+i.compound_interest(principal, time, rateOfInterest, choice));
					break;
				default:
					System.out.println("enter valid number");
			}
		}
}

	


