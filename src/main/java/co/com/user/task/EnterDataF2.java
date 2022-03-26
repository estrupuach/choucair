package co.com.user.task;

import co.com.user.userinterface.FormAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class EnterDataF2 implements Task {
    String getStrPostalCode;
    String getStrCity;

    public EnterDataF2(String getStrCity, String getStrPostalCode) {
        this.getStrPostalCode = getStrPostalCode;
        this.getStrCity = getStrCity;
    }

    public static EnterDataF2 onTheForm(String getStrCity, String getStrPostalCode) {
        return Tasks.instrumented(EnterDataF2.class,getStrCity,getStrPostalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //UI2
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Enter.theValue(getStrCity).into(FormAddress.INPUT_CITY));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Hit.the(Keys.ARROW_DOWN).into(FormAddress.INPUT_CITY),
                Hit.the(Keys.ENTER).into(FormAddress.INPUT_CITY),
                Enter.theValue(getStrPostalCode).into(FormAddress.INPUT_POSTAL_CODE),
                Click.on(FormAddress.BUTTON_NEXT)
        );
    }
}