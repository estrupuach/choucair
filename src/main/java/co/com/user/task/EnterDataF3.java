package co.com.user.task;

import co.com.user.userinterface.FormDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class EnterDataF3 implements Task {
    String strMobile;
    String strModel;
    String strOperatingSystem;

    public EnterDataF3(String strMobile, String strModel, String strOperatingSystem) {
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOperatingSystem = strOperatingSystem;
    }

    public static EnterDataF3 onTheForm(String strMobile, String strModel, String strOperatingSystem) {
        return Tasks.instrumented(EnterDataF3.class,strMobile,strModel,strOperatingSystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormDevices.OPEN_LIST_DEVICE));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(strMobile).into(FormDevices.WRITE_MOBILE),
                Hit.the(Keys.ENTER).into(FormDevices.WRITE_MOBILE));

        actor.attemptsTo(Click.on((FormDevices.OPEN_LIST_MODEL)));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(strModel).into(FormDevices.WRITE_MODEL),
                Hit.the(Keys.ENTER).into(FormDevices.WRITE_MODEL));


        actor.attemptsTo(Click.on(FormDevices.OPEN_LIST_OPERATING_SYSTEM));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Enter.theValue(strOperatingSystem).into(FormDevices.WRITE_OPERATING_SYSTEM),
                Hit.the(Keys.ENTER).into(FormDevices.WRITE_OPERATING_SYSTEM));

        actor.attemptsTo(Click.on(FormDevices.BUTTON_NEXT));
    }
}