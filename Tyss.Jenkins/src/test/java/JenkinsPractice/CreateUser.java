package JenkinsPractice;

import org.testng.annotations.Test;

public class CreateUser {

	@Test(groups = "Regression")
	public void createUser()
	{
		System.out.println("Regression User Created");
		
		System.out.println("Changed User Created");
		
		System.out.println("Changed User Deleted");
	
		System.out.println("Changed User Modified");
	
	}
}
