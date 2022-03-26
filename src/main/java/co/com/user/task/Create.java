package co.com.user.task;

import co.com.user.userinterface.CreateUserPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Create implements Task {
    public static Create onThePage() {
        return Tasks.instrumented(Create.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CreateUserPage.CREATE_BUTTON));
    }
}
