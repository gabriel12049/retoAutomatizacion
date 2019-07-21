package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.VivandaResultPage.CLOSE_MODAL;
import static ui.VivandaResultPage.SELECT_PRODUCT;

public class SelectProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_PRODUCT),

                Click.on(CLOSE_MODAL));
    }

    public static SelectProduct onVivandaResultPage() {
        return instrumented(SelectProduct.class);
    }
}
