package finalproject.tdtu;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		menu();
	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		SingletonList listE = new SingletonList().getInstance();
		int choice, type, min, max = 0, pos;
		while (true) {
			System.out.println("\n------------Menu-----------");
			System.out.println("0: Dummy data");
			System.out.println("1: Input new employee");
			System.out.println("2: Display all employee");
			System.out.println("3: Find employee by ID");
			System.out.println("4: Delete employee by ID");
			System.out.println("5: Update employee by ID");
			System.out.println("6: Display employee by Salary");
			System.out.println("7: Sort employee by Name");
			System.out.println("8: Sort employee by Salary");
			System.out.println("9: EXIT!");
			System.out.println("----------------------------");
			System.out.print("Your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				listE.dummyData();
				System.out.println("Data is inputed!");
				break;
			case 1:
				System.out.println("1: Input Employee");
				System.out.println("2: Input Marketing Staff");
				System.out.println("3: Input Leader");
				type = sc.nextInt();
				if (type == 1){
					listE.input(FactoryType.EMPLOYEE);
				}
				if (type == 2){
					listE.input(FactoryType.MARKETINGSTAFF);
				}
				if (type == 3){
					listE.input(FactoryType.LEADER);
				}
				break;
			case 2: 
				listE.display();
				break;
			case 3:
				System.out.print("Enter ID: ");
				Command findid1 = new FindId(listE);
				findid1.execute();
				break;
			case 4:
				System.out.print("Enter ID: ");
				Command delid = new DeleteId(listE);
				delid.execute();
				break;
			case 5:
				System.out.print("Enter ID: ");
				Command updateEm = new UpdateEmployee(listE);
				updateEm.execute();
				break;
			case 6:
				System.out.print("Salary from: ");
				min = sc.nextInt();
				System.out.print("to: ");
				max = sc.nextInt();
				listE.findSalary(min, max);
				break;
			case 7:
				listE.setStrategySort(new SortByName());
				listE.sort();
				break;
			case 8:
				listE.setStrategySort(new SortBySalary());
				listE.sort();
			}
			if (choice == 9){
				System.out.println("EXIT!");
				break;
			}
		}
	}
}
