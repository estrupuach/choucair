package co.com.user.task;

import co.com.user.userinterface.FormLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterDataF4 implements Task {
    String strPassword, strConfPassword;

    public EnterDataF4(String strPassword, String strConfPassword) {
        this.strPassword = strPassword;
        this.strConfPassword = strConfPassword;
    }

    public static EnterDataF4 onTheForm(String strPassword, String strConfPassword) {
        return Tasks.instrumented(EnterDataF4.class,strPassword,strConfPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(FormLastStep.CREATE_PASSWORD),
                Enter.theValue(strConfPassword).into(FormLastStep.CONFIRM_PASSWORD),
                Click.on(FormLastStep.CHECK_STAY_INFORMED),
                Click.on(FormLastStep.ACCEPT_TERMS),
                Click.on(FormLastStep.ACCEPT_PRIVACY),
                Click.on(FormLastStep.BUTTON_FINISH)
        );
    }
}
