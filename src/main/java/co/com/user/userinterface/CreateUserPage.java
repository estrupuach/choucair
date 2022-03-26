package co.com.user.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreateUserPage extends PageObject {
    public static final Target CREATE_BUTTON = Target.the("button that " +
            "shows us the form to register").locatedBy("(//a[text()='Join Today'])[1]");
}
