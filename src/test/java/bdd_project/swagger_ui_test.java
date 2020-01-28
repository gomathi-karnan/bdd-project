package bdd_project;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class swagger_ui_test {

@Given("^user must launch browser$")
public static void user_must_launch_browser()
{
	
	System.out.println("Hello");
	
}
@When("user in the swagger ui")
public void user_in_the_swagger_ui() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new cucumber.api.PendingException();
	System.out.println("user_in_the_swagger_ui");

}


@Then("user must be in {string} and verify")
public void user_must_be_in_and_verify(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(string+"  hello gomathi");
    
}

@Then("cards are displayed {string}")
public void cards_are_displayed(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("cards are missing"+string);
}
    

@Then("^user must be enter \"([^\"]*)\" and \"([^\"]*)\" verify$")
public void user_must_be_enter_gomathiusernmae_and_vymopassword_verify( String s1, String s2) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("hello then");

	System.out.print("cards are missing in gomathiusernmae" + s1);
	System.out.println("bye then");

}

@Then("user must be enter maniusernmae and password verify")
public void user_must_be_enter_maniusernmae_and_password_verify() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("cards are missing in maniusernmae");
}

@Then("user must be enter gomathiusernmae and vymopassword verify")
public void user_must_be_enter_gomathiusernmae_and_vymopassword_verify() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("cards are missing in maniusernmae");
}

@Given("launch browser")
public void launch_browser() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("launch browser");
}

@When("user in right page")
public void user_in_right_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("user in right page");
}

//@Then("validate the user landed page")
//public void validate_the_user_landed_page() {
//    // Write code here that turns the phrase above into concrete actions
//	System.out.println("validate the user landed page");
//}

@Before("@regtest")

	public void beforetest() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.print("validate the before test hooked tag");
	}

}
