package Testing;

import PageObjects.Baseclass;
import PageObjects.LoginPageObjects;
import PageObjects.SearchHotelObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddactinTest extends Baseclass {
	
	@Given("user is on Adactin hotel page")
	public void user_is_on_adactin_hotel_page() {
		browserLaunch("chrome");
	    get("https://adactinhotelapp.com/");
	}
	@When("user should login {string} and {string}")
	public void user_should_login_and(String string, String string2) {
		LoginPageObjects loginpage = new LoginPageObjects();
		loginpage.login(string, string2);
	}
	@When("user should search hotel by {string}, {string}, {string}, {string}, {string}, {string},{string} and {string}")
	public void user_should_search_hotel_by_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		SearchHotelObjects searchPage = new SearchHotelObjects();
		searchPage.seachHotel(string, string2, string3, string4, string5, string6, string7, string8);
	}
	@Then("user click on submit buuton")
	public void user_click_on_submit_buuton() {
		SearchHotelObjects searchPage = new SearchHotelObjects();
	    searchPage.clickSubmitbutton();
	}
}
