package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourceEmployee;

public class Applications {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//list of Employees
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Entre com o número de funcionários: ");
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Funcionário #"+ (i+1) + " dados: ");
			System.out.print("Funcionário terceirizado (y/n)?  ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hora: ");
			int hours = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valuePerHours = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Cobrar taxa adiiconal: ");
				double additionalCharge = sc.nextDouble();
				//instantiate employee
				Employee func = new OutSourceEmployee(name, hours, valuePerHours, additionalCharge);
				list.add(func);
			} else {
				Employee func = new Employee(name, hours, valuePerHours);
				list.add(func);
			}
		}
			System.out.println();
			System.out.println("PAYMENTS: ");
			for (Employee func : list) {
				System.out.println(func.getName() + " - $ " + String.format("%.2f", func.payment()));
			}		
			
		sc.close();
	}
}