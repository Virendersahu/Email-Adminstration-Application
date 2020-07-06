package email_app;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email em1= new Email("Virender","Sahu");
		
//		em1.setAlternateEmail("john@gmail.com");
//		System.out.println("Aternate Email is:" + em1.getAlternateEmail());
//		
//		em1.setChangePassword("doit1267*");
//		System.out.println("Alternate Password is:" + em1.getChangePassword());
//		
//		em1.setMailboxCapacity(1000);
//		System.out.println("Change Capacity is:" + em1.getMailboxCapacity());
		
		// to show info of employee
		System.out.println(em1.Show());

	}

}
