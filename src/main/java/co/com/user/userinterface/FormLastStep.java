package co.com.user.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormLastStep extends PageObject {
    public static final Target CREATE_PASSWORD = Target.the("Create the password for user")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm the password for user")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAY_INFORMED = Target.the("Confirm for stay informed from email")
            .located(By.name("newsletterOptIn"));

    public static final Target ACCEPT_TERMS = Target.the("Accept the terms ")
            .located(By.id("termOfUse"));
    public static final Target ACCEPT_PRIVACY = Target.the("Accept the Privacy and security policy ")
            .located(By.id("privacySetting"));//
    public static final Target BUTTON_FINISH = Target.the("Button that finalice end the register ")
            .located(By.id("laddaBtn"));

}
