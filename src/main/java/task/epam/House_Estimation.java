package task.epam;

import java.util.Scanner;

public class House_Estimation {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 to use standard materials");
				System.out.println("Enter 2 to use above standard materials");
				System.out.println("Enter 3 to use high standard materials");
				System.out.println("Enter 4 to use high standard materials and require a fully automated home");
				int choice = sc.nextInt();
				
				System.out.println("Enter the area in square feet");
				double area = sc.nextDouble();
				System.out.println("Do you want a fully automated home? (y/n)");
				boolean ans;
				char ch = sc.next().charAt(0);
				if(ch == 'y' || ch == 'Y'){
					ans = true;
				}else{
					ans = false;
				}
				
				house_construction h = new house_construction();
				String standard ="";
			
				switch(choice){
					case 1:
						standard = "standard";
				System.out.println("House Construction cost using standard materials : "+h.cost(standard, area, ans));
						
						break;
					case 2:
						standard = "above standard";
						System.out.println("House Construction cost using above standard materials : "+h.cost(standard, area, ans));
						
						break;
					case 3:
						standard = "high standard";
						System.out.println("House Construction cost using high standard materials : "+h.cost(standard, area, ans));
						
						break;
					case 4:
						System.out.println("House Construction cost using high standard materials for fully automated home : "+h.cost("high standard", area, ans));
						
						break;
					default:
						System.out.println("Please enter a valid number");
				}
			}

}
