package PeytonBosco.Lab1.Package;

import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class Lab1Main {

	public static void main(String[] args) {
		// Lab 1
		
		Scanner scnr = new Scanner(System.in);
		//Ask user to input the information
		System.out.println("How many years do you plan to work?");
		double workYears = scnr.nextDouble();
		
		System.out.println("What is your expected average return on investment?");
		double averageReturn = scnr.nextDouble();
		
		System.out.println("How long will you draw money?");
		double retirementYears = scnr.nextDouble();
		
		System.out.println("What is your required income?");
		double requiredIncome = scnr.nextDouble();
		
		System.out.println("What is your expected SSI income?");
		double SSIincome = scnr.nextDouble();
		
		//variables 
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;
		
		//calculating the present value
		double PV;
		r = SSIincome / 12;
		n = retirementYears * 12;
		y = requiredIncome - 2642;
		f = 0;
		t = false;
		PV = FinanceLib.pv(r, n, y, f, t);
		System.out.println(PV);
		
		//calculating the payment
		double PMT;
		r = averageReturn / 12;
		n = workYears * 12;
		p = 0;
		f = PV;
		t = false;
		PMT = FinanceLib.pmt(r, n, p, f, t);
		System.out.println(PMT);
		
		
		
		
		
		

	}

}
