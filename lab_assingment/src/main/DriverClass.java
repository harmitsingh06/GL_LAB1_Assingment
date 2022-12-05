package main;

import java.util.Scanner;

import interfaces.ICredentials;
import models.Employee;
import service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee employee = new Employee ("Harmit", "Singh");
		
		
		ICredentials cs = new CredentialService ();
		
		System.out.println("please enter the department from the following options ");
		
		System.out.println("1. Technical ");
		
		System.out.println("2. Admin ");
		System.out.println("3. Human Resource ");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner (System.in);
		int option = sc.nextInt();
		
		String generatedEmail = null ;
		String generatedPassword = null ;
		
			switch(option) {
		
			case 1: {
			
			     generatedEmail = cs. generateEmailAddress(employee.getFirstName(). toLowerCase(),
					         
				                  employee.getLastName().toLowerCase(), "tech"); 
			     generatedPassword = cs.generatePassword();
			     break;
			     
			}
			     case 2: {
			    	 
			    	 generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
			    			 employee.getLastName().toLowerCase(), "adm");
			    	 generatedPassword = cs.generatePassword ();
			    	 break;
			     }
			     
			     
			     case 3:{
			    	 
			    	 generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
			    			 employee.getLastName().toLowerCase(), "hr");
			    	 generatedPassword = cs.generatePassword ();
			    	 break;
			     }
			    	 
			    	 case 4: {
			    		 
			    		 generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
				    			 employee.getLastName().toLowerCase(), "lg");
				    	 generatedPassword = cs.generatePassword ();
				    	 break;
		       	}
			    default :{
				System.out.println("Enter a valid option ");
			}
			
	       }
	
	employee.setEmail(generatedEmail);
	employee.setPassword(generatedPassword);
	cs.showCredentials(employee);
	sc.close();
	
	
					           
		}
					

	}


