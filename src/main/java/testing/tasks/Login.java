package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import testing.ui.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String username;
    private final String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.username).into(LoginPage.USERNAME),
                Enter.theValue(this.password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.SUBMIT_BUTTON)
        );
    }

    public static Login conCredenciales(String username, String password) {
        return instrumented(Login.class, username, password);
    }
}
