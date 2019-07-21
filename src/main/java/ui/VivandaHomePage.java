package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VivandaHomePage {
    public static final Target SEARCH_BAR = Target.the("la barra de busqueda").located(By.xpath("//*[@id=\"sticky-wrapper\"]/div/div[1]/div/div/div[4]/form/input"));

}
