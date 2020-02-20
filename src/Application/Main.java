package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = s.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("\nEmplyoee #%d: \n", i+1);
			s.nextLine();
			System.out.print("Id: ");
			String id = s.nextLine();
			System.out.print("Name: ");
			String name = s.nextLine();
			System.out.print("Salary: ");
			double salary = s.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		s.nextLine();
		String id = s.nextLine();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double porc = s.nextDouble();
			emp.aumento(porc);
		}
		
		/* Minha solução
		list.forEach(i->{
			if(id.equals(i.getId())) {
				System.out.print("Enter the percentage: ");
				double porc = s.nextDouble();
				i.aumento(porc);
			}
		});
		*/
		
		System.out.println("\nList of employees:");
		for(Employee empl : list) {
			System.out.printf("%s, %s, %.2f\n", empl.getId(), empl.getName(), empl.getSalary());
		}
		s.close();
	}
}
