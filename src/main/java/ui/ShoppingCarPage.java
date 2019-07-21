package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCarPage {

    public static final Target CAR_ICON = Target.the("carrito de compas").located(By.className("minicart__btn"));
    public static final Target PRODUCT_NAME = Target.the("nombre del producto en el carrito").located(By.className("cartSkuName"));
    public static final Target QUANTITY = Target.the("cantidad del producto en el carrito").located(By.className("vtexsc-skuQtt"));
}
