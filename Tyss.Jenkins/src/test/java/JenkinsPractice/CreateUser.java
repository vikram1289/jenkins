package JenkinsPractice;

import org.testng.annotations.Test;

public class CreateUser {

	@Test(groups = "Regression")
	public void createUser()
	{
		System.out.println("Regression User Created");
	}
}
