package co.com.user.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormAddress extends PageObject {
    public static final Target INPUT_CITY = Target.the("Input for write and search city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Input for write postal code")
            .located(By.id("zip"));
    public static final Target BUTTON_NEXT = Target.the("Button that continue the next page")
            .locatedBy("//a[@href='#']");
    public static final Target INPUT_COUNTRY = Target.the("Button that continue the next page")
            .located(By.name("countryId"));
    public static final Target WRITE_COUNTRY = Target.the("Button that continue the next page")
            .located(By.name("countryId"));
}
