package org.swaglabs.tasks.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.swaglabs.models.LoginData;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.swaglabs.userinterfaces.LoginPage.*;

public class LoginTask implements Task {
    private List<LoginData> credentials;

    public LoginTask(List<LoginData> credentials) {
        this.credentials = credentials;
    }

    public static LoginTask loginTaskInstrumented(List<LoginData> data) {
        return instrumented(LoginTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credentials.get(0).getUsername()).into(INPUT_USER),
                Enter.theValue(credentials.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }
}
