package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.NameNotFound;
import exceptions.QuantityNotFound;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import question.TheSelectedProduct;
import question.TheSelectedquantity;
import task.SearchProduct;
import task.SelectProduct;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class compraStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor gabriel = Actor.named("Gabriel");

    @Before
    public void actorCanBrowseTheWeb() {
        gabriel.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^User is on the vivanda site$")
    public void userIsOnTheVivandaSite() {
        gabriel.wasAbleTo(new OpenUrl("https://www.vivanda.com.pe/"));
    }

    @When("^The user searches the product$")
    public void theUserSearchesTheProduct(List<String> product) {
        gabriel.attemptsTo(SearchProduct.onVivanda(product));
    }

    @And("^add the product to the shopping cart$")
    public void addTheProductToTheShoppingCart() {
        gabriel.attemptsTo(SelectProduct.onVivandaResultPage());
    }

    @Then("^The user verifies that the product of the shopping cart is the same one that was selected$")
    public void theUserVerifiesThatTheProductOfTheShoppingCartIsTheSameOneThatWasSelected(List<String> datos) throws Exception {
        gabriel.should(seeThat(TheSelectedProduct.inTheShoppingCar(), equalTo(datos.get(0)))
                .orComplainWith(NameNotFound.class, NameNotFound.NAME_NOT_FOUND));
        gabriel.should(seeThat(TheSelectedquantity.inTheShoppingCar(), equalTo(datos.get(1)))
                .orComplainWith(QuantityNotFound.class, QuantityNotFound.QUANTITY_NOT_FOUND));
    }


}
