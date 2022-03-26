package co.com.user.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Title extends PageObject {
    public static final Target WELCOME_TITLE = Target.the("get the message welcome from title ")
            .locatedBy("//h1[text()=\"Welcome to the world's largest community of freelance software testers!\"]");
    //[text()='Welcome to the world"+"'"+"s largest community of freelance software testers!']"
}
