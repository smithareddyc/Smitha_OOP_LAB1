package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.interfaces.iCredentials;
import com.greatlearning.model.Employee;

public class CredentialService implements iCredentials{
	
	//string department;
	public String generateEmailAddress(Employee employee , String department) {
		return employee.getFirstName()+employee.getLastName()+"@"+department+ "@abc.com" ;
		
	}
	public String generatePassword() {	
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		  String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		  String numbers = "0123456789";
		  String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		  String values = capitalLetters+smallLetters+numbers+specialCharacters;
		  Random random = new Random();
		  String password = "";
		  //char[] passwordChar = {'c','h'};
		  //String.valueOf(values.charAt(random.nextInt(values.length())));
		  //System.out.println("random"+values.charAt(random.nextInt(values.length())));
		  
		  for(int i = 0; i<=8;i++)
		  {
			  password = password+String.valueOf(values.charAt(random.nextInt(values.length())));
		  }
		return password;
		
	}
	public void showCredentials(Employee employee) {
		System.out.println("Hello "+employee.getFirstName()+employee.getLastName());
		System.out.println("The email address is: " +employee.getEmail() );
		System.out.println("The password address is: " +employee.getPwd() );
	
		
	}


}
