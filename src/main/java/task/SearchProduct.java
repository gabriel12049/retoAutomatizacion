package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.VivandaHomePage.SEARCH_BAR;

public class SearchProduct implements Task {

    private List<String> product;
    public SearchProduct(List<String> product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(product.get(0)).into(SEARCH_BAR).thenHit(Keys.ENTER));
    }

    public static SearchProduct onVivanda(List<String> product) {
        return instrumented(SearchProduct.class, product);
    }
}
