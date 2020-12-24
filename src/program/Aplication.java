package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Company;
import entites.Individual;
import entites.TaxPayer;

public class Aplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of Taxpayers: ");
		int N = sc.nextInt();

		List<TaxPayer> list = new ArrayList<TaxPayer>();

		for(int i = 1; i<= N; i++) {
			System.out.println("Taxpayer #" + i + "data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual imcome: ");
			Double anualIncome = sc.nextDouble();
			
			
			if(type == 'i') {
				System.out.println("Health expenditures");
				Double healthExpenditures = sc.nextDouble();
				list.add(new  Individual(name, anualIncome, healthExpenditures));

			} else {
				System.out.println("Number of employees");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}


		System.out.println();
		System.out.println("TAXES PAID");

		for(TaxPayer tp : list) {
			System.out.println(tp.getName() + " : $ " + String.format("%.2f",  tp.tax()))   ;
		}


		sc.close();
	}
}
