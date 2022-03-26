package co.com.user.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Form1 extends PageObject {
    public static final Target INPUT_FNAME = Target.the("input for write first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LNAME = Target.the("input for write last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("input for write email address")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("input for write month of birth")
            .located(By.id("birthMonth"));
    public static final Target SELECT_MONTH = Target.the("Select month of birth")
            .locatedBy("//option[@label='April']");
    public static final Target INPUT_DAY = Target.the("input for write day of birth")
            .located(By.id("birthDay"));
    public static final Target SELECT_DAY = Target.the("Select day of birth")
            .locatedBy("//option[@label='2']");
    public static final Target INPUT_YEAR = Target.the("input for write year of birth")
            .located(By.id("birthYear"));
    public static final Target SELECT_YEAR = Target.the("Select year of birth")
            .locatedBy("//option[@label='1999']");
    public static final Target BUTTON_NEXT = Target.the("Button that continue the next page")
            .locatedBy("//a[@href='#']");

}
