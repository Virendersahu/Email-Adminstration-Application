package email_app;

import java.util.Scanner;

public class Email {
	
	private String FirstName;
	private String LastName;
	private String Department;
	private String Password;
	private int defaultLength = 10;
	private String email;
	private String alternateEmail;
	private int mailboxCapacity = 500;
	private String companySufix = "Dreambig.com";
	
	
	//constructor to receive the first name and last name
	public Email(String FirstName, String LastName )
	{
		this.FirstName= FirstName;
		this.LastName= LastName;
		
		//System.out.println("EMAIL CREATED:"  +  this.FirstName + " " + this.LastName);
		
		//call the setDepartment method and asking for department and return the department.
		this.Department = setDepartment();
		//System.out.println("Department is:" + " " +this.Department);
		
		//call a method that return a random Password 
		this.Password = randomPassword(defaultLength);
		System.out.println("Your Password is:" + this.Password);
			
	    // email 
		email = FirstName.toLowerCase()+ "." + LastName.toLowerCase() + "@" + Department + "." + companySufix;
		//System.out.println("Email Created: "+ email);
	}
	
	
	//ask for the department
	private String setDepartment()
	{
		System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter the Depatment code: ");
		Scanner scn = new Scanner(System.in);
		int depChoice = scn.nextInt();
		if(depChoice == 1)
		{
			return "Sales";
		} else if(depChoice == 2)
		{
			return "Development";
		}else if(depChoice == 3)
		{
			return "Accounting";
		}else
		{
			return "None";
		}
		
	}
	
	
	//Generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789*!&%#$@";
		char[] password= new char[length];
		for(int i=0; i<length; i++)
		{
			int rand= (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	
	//set the mailbox capacity
	public void setMailboxCapacity(int Capacity)
	{
		this.mailboxCapacity= Capacity;
	}
	
	//set the alternate mail id
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	
	//set(change) the password
	public void setChangePassword(String pass)
	{
		this.Password = pass;
	}
	
	
	//get the mailbox capacity
	public int getMailboxCapacity(){ return mailboxCapacity; }
	
	//get the alternate email id	
	public String getAlternateEmail(){ return alternateEmail; }
	
	//get the password
	public String getChangePassword(){ return Password; }
	
	
	public String Show()
	{
		return "Display name:" + FirstName + LastName +"\n" +
				"Comapny E-mail:" + email +"\n"+ 
				"MailBox Capacity:" + mailboxCapacity +"mb";
		        
	}
}
