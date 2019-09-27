package boom.mam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser.bro;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login {
WebDriver d;
@Given("^Check for login$")
public void check_for_login() throws Throwable {
d=bro.open("chrome", "http://10.232.237.143:443/TestMeApp/fetchcat.htm");
d.findElement(By.linkText("SignIn")).click();
}

@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_and(String arg1, String arg2) throws Throwable {
d.findElement(By.name("userName")).sendKeys(arg1);
d.findElement(By.name("password")).sendKeys(arg2);
d.findElement(By.name("Login")).click();
}

@Then("^User Land in Homepage$")
public void user_Land_in_Homepage() throws Throwable {
Assert.assertEquals(d.getTitle(),"Home");
d.close();
}



}
