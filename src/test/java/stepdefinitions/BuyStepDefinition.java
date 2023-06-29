package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.swaglabs.models.BuyData;
import org.swaglabs.questions.BuyPageQuestion;
import org.swaglabs.tasks.buy.BuyPayCart;
import org.swaglabs.tasks.buy.BuyProductCart;
import org.swaglabs.tasks.buy.BuyTask;
import org.swaglabs.utils.Utils;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;


public class BuyStepDefinition {

    @Given("^(.*) is on the site buy$")
    public void swaglabsUserIsOnTheSiteBuy(String actorName) {
        OnStage.theActor(actorName).entersTheScene();
    }

    @When("^select a product (.*) and adds it to the cart$")
    public void selectAProductCamisaSauceLabsBoltAndAddsItToTheCart(String nameProduc) {
        BuyData.setProducts(Utils.convertUtf8(nameProduc));
        theActorInTheSpotlight().attemptsTo(BuyTask.buy());
    }

    @When("^selects another product (.*) and adds it to the cart$")
    public void selectsAnotherProductCamisaTestAllTheThingsRojaAndAddsItToTheCart(String nameProduc2) {
        BuyData.setProducts(Utils.convertUtf8(nameProduc2));
        theActorInTheSpotlight().attemptsTo(BuyTask.buy());
    }

    @Then("^the products must be in the shopping cart$")
    public void theProductsMustBeInTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(BuyProductCart.buyProductCart());
    }

    @Then("^proceed to pay and complete the checkout information with your (.*), (.*), and (.*)$")
    public void proceedToPayAndCompleteTheCheckoutInformationWithYourAdrianRicoAnd(String name, String lastName, String postalCod) {
        theActorInTheSpotlight().attemptsTo(BuyPayCart.buyPayCart(name, lastName, postalCod));
    }

    @Then("^thank you for your order$")
    public void thankYouForYourOrder() {
        theActorInTheSpotlight().should(
                seeThat(
                        "Pay succesful",
                        BuyPageQuestion.succesfulPay(),
                        equalTo("GRACIAS POR SU ORDEN")
                )
        );
    }


}
