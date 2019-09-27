package boom.mam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import browser.bro;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class regi
{
WebDriver d;
@Given("^User Should be in Registration Page$")
public void user_Should_be_in_Registration_Page() throws Throwable {
d=bro.open("chrome", "http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
}

@When("^User enters user name \"([^\"]*)\"$")
public void user_enters_user_name(String arg1) throws Throwable {
d.findElement(By.name("userName")).sendKeys(arg1);
}

@When("^User Enters First name \"([^\"]*)\"$")
public void user_Enters_First_name(String arg1) throws Throwable {
	d.findElement(By.name("firstName")).sendKeys(arg1);
}

@When("^User Enters Lastname \"([^\"]*)\"$")
public void user_Enters_Lastname(String arg1) throws Throwable {
	d.findElement(By.name("lastName")).sendKeys(arg1);
}

@When("^User Enters Password \"([^\"]*)\"$")
public void user_Enters_Password(String arg1) throws Throwable {
	d.findElement(By.name("password")).sendKeys(arg1);
}

@When("^User Re-Enters Password \"([^\"]*)\"$")
public void user_Re_Enters_Password(String arg1) throws Throwable {
	d.findElement(By.name("confirmPassword")).sendKeys(arg1);
}

@When("^User Selects Gender \"([^\"]*)\"$")
public void user_Selects_Gender(String arg1) throws Throwable {
	d.findElement(By.xpath("//input[@type='radio' and @value='"+arg1+"']")).click();
}

@When("^User Enter Email \"([^\"]*)\"$")
public void user_Enter_Email(String arg1) throws Throwable {
	d.findElement(By.name("emailAddress")).sendKeys(arg1);
}

@When("^User Enter mobilenum \"([^\"]*)\"$")
public void user_Enter_mobilenum(String arg1) throws Throwable {
	d.findElement(By.name("mobileNumber")).sendKeys(arg1);
}

@When("^User Enter dob \"([^\"]*)\"$")
public void user_Enter_dob(String arg1) throws Throwable {
	d.findElement(By.name("dob")).sendKeys(arg1);
}

@When("^User Enter Address \"([^\"]*)\"$")
public void user_Enter_Address(String arg1) throws Throwable {
	d.findElement(By.name("address")).sendKeys(arg1);
}

@When("^User Selects Security Question \"([^\"]*)\"$")
public void user_Selects_Security_Question(String arg1) throws Throwable {
Select s=new Select(d.findElement(By.name("securityQuestion")));
s.selectByVisibleText(arg1);

}

@When("^User enters Answer \"([^\"]*)\"$")
public void user_enters_Answer(String arg1) throws Throwable {
	d.findElement(By.name("answer")).sendKeys(arg1);
}

@Then("^User land on login page$")
public void user_land_on_login_page() throws Throwable {
	d.findElement(By.name("Submit")).click();
}
}