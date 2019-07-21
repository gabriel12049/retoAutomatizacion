package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.ShoppingCarPage;

public class TheSelectedquantity implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return ShoppingCarPage.QUANTITY.resolveFor(actor).getText().split("")[1];
    }

    public static Question<String> inTheShoppingCar() {
        return new TheSelectedquantity();
    }
}
