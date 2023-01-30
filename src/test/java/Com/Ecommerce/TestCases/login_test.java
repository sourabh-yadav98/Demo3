package Com.Ecommerce.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerce.Pageclass.login;
// Test class
public class login_test extends login
{
	@Test
	public void test ()
	{
		login com = new login();
		com.setuse("sy6369919@gmail.com");
		com.setpass("7218970202");
		com.click();
		
		if (driver.getTitle().equals("nopCommerce demo store. Login"))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
