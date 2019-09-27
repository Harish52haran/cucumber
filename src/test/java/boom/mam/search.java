package boom.mam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.bro;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class search {
	WebDriver d;
@Given("^User Should be Logged in$")
public void user_Should_be_Logged_in() throws Throwable {
	d=bro.open("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	d.findElement(By.linkText("SignIn")).click();
	  d.findElement(By.name("userName")).sendKeys("lalitha");
	  d.findElement(By.name("password")).sendKeys("password123");
	  d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  d.findElement(By.name("Login")).click();
}

@When("^user enter minimum of four char in testbox \"([^\"]*)\"$")
public void user_enter_minimum_of_four_char_in_testbox(String arg1) throws Throwable {
d.findElement(By.name("products")).sendKeys(arg1);
d.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
if(arg1.length()>=4)
{
	if((d.getTitle()).equals("Search"))
	{
		Assert.assertEquals(d.getTitle(),"Search");
		d.findElement(By.linkText("Add to cart")).click();
		d.findElement(By.partialLinkText("Cart")).click();
		d.findElement(By.linkText("Checkout")).click();
		d.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		d.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/label/i")).click();
		 d.findElement(By.linkText("CONTINUE")).click();
		 d.findElement(By.name("username")).sendKeys("123459");
		  d.findElement(By.name("password")).sendKeys("Pass@459");
		  d.findElement(By.xpath("//input[@value='LOGIN']")).click();
		  d.findElement(By.name("transpwd")).sendKeys("Trans@459");
		  d.findElement(By.xpath("//input[@value='PayNow']")).click();
		  d.close();
	}
	else
	{
		Assert.assertEquals(d.findElement(By.linkText("Add to cart")),"/html/body/section/div/div/div[2]/h3");
		int i=0;
				if(i==0)
				{
		System.out.println("Product Not Found");
		d.close();
				}
	}
}
else
{
	Assert.assertEquals(d.getTitle(),"Search");
	System.out.println("Min of 4 Char Required");
	d.close();
}
}

@Then("^user should be in cart page$")
public void user_should_be_in_cart_page() throws Throwable {
d.close();
}



}
