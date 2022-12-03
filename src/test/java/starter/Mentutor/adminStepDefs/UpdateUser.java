package starter.Mentutor.adminStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Mentutor.loginAdmin.AdminAPI;

public class UpdateUser {
    @Steps
    AdminAPI adminAPI;

    @Given("Update user with valid data and authenticated")
    public void updateUserWithValidDataAndAuthenticated(){
        adminAPI.updateUserWithValidDataAndAuthorization();
    }

    @When("Send update request")
    public void sendUpdateRequest() {
        SerenityRest.when().put(AdminAPI.ADMIN_MANAGE_USERS);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int created) {
        SerenityRest.then().statusCode(created);
    }
}
