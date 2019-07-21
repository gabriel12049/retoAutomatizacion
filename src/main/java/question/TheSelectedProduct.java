package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.ShoppingCarPage;

public class TheSelectedProduct implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        ShoppingCarPage.CAR_ICON.resolveFor(actor).click();
        return ShoppingCarPage.PRODUCT_NAME.resolveFor(actor).getText();
    }

    public static Question<String> inTheShoppingCar() {
        return new TheSelectedProduct();
    }

}
