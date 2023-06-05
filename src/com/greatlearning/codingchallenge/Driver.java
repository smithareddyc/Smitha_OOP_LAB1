package com.greatlearning.codingchallenge;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;

public class Driver {
	public static void main(String args[]) {
		
		int option;
		
		System.out.println("Hi");
		Employee obj = new Employee("Smitha", "Reddy");
		Scanner sc = new Scanner(System.in);
		displayMenu();
        option = sc.nextInt();
        System.out.println("The option chosen is: "option);
        
        CredentialService CredentialService = new CredentialService();
        
        String[] departments = {"tech","admin","hr","legal"};
		String emailAddress = CredentialService.generateEmailAddress(obj,departments[option -1]);
		//System.out.println(emailAddress);
		
		String password = CredentialService.generatePassword();
        //System.out.println(password);
        
        obj.setEmail(emailAddress);
        obj.setPwd(password);
		CredentialService.showCredentials(obj);
		
       
	}
	
	public static void displayMenu() {
		System.out.println("Choose the number for the Department you belong");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
	}
	
	
}
