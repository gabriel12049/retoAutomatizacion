package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VivandaResultPage {
    public static final Target SELECT_PRODUCT = Target.the("Seleccionar producto").located(By.xpath("//*[@id=\"30260\"]/a"));
    public static final Target CLOSE_MODAL = Target.the("x que cierra el modal de entrega").located(By.className("SalesChannel__close"));

}
