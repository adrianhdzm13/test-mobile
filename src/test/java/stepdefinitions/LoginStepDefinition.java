package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.swaglabs.models.LoginData;
import org.swaglabs.questions.LoginPageQuestion;
import org.swaglabs.tasks.login.LoginTask;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinition {


    @Given("^(.*) is on the site$")
    public void swaglabsUserIsOnTheSite(String actorName) {
        OnStage.theActor(actorName).entersTheScene();
    }


    @When("^input the credentials login form$")
    public void inputTheCredentialsLoginForm(List<LoginData> data) {
        theActorInTheSpotlight().attemptsTo(
                LoginTask.loginTaskInstrumented(data)
        );

    }

    @Then("^Enter the sales screen for items$")
    public void enterTheSalesScreenForItems() {
        theActorInTheSpotlight().should(
                seeThat(
                        "Resul exits",
                        LoginPageQuestion.succesful(),
                        equalTo("PRODUCTOS")
                )
        );
    }



}
