package service;

import java.util.Random;

import interfaces.ICredentials;
import models.Employee;


public class CredentialService implements  ICredentials {
	
	
	public String generatePassword() {
		
		String CapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SmallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String SpecialCharacters = "!@#$%^&*_+-/.?<>)";
		
	String values = CapitalLetters + SmallLetters +SpecialCharacters + numbers;
	
	Random random = new Random();
	
	String Password="";
	char temp;
	
	for (int i = 0; i<8; i++) {
		
		Password += String.valueOf(values.charAt(random.nextInt(values.length())));
		
	}
	return Password;
	}
	
	
	
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
		
	}
	
	@Override 
	public void showCredentials(Employee employee) {
		
		System.out.println("Dear " + employee.getFirstName() + "your generated credentials are as follow");
		System.out.println("Email\t\t"+employee.getEmail());
		System.out.println("Password\t"+employee.getPassword());
	}
}

		

		
	
	


	
