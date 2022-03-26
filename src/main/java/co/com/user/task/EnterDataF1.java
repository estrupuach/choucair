package co.com.user.task;

import co.com.user.userinterface.Form1;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterDataF1 implements Task {
    String strFirsName;
    String strLastName;
    String strEmail;

    public EnterDataF1(String strFirsName, String strLastName, String strEmail) {
        this.strFirsName = strFirsName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }

    public static EnterDataF1 onTheForm(String strFirsName, String strLastName, String strEmail) {
        return Tasks.instrumented(EnterDataF1.class,strFirsName,strLastName,strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //UI1
        actor.attemptsTo(Enter.theValue(strFirsName).into(Form1.INPUT_FNAME),
                Enter.theValue(strLastName).into(Form1.INPUT_LNAME),
                Enter.theValue(strEmail).into(Form1.INPUT_EMAIL),
                Click.on(Form1.INPUT_MONTH),
                Click.on(Form1.SELECT_MONTH),
                Click.on(Form1.INPUT_DAY),
                Click.on(Form1.SELECT_DAY),
                Click.on(Form1.INPUT_YEAR),
                Click.on(Form1.SELECT_YEAR),
                Click.on(Form1.BUTTON_NEXT)
                );

        //UI3




    }
}
