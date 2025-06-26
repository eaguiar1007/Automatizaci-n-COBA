package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import testing.ui.LoginPage;
import java.util.concurrent.TimeUnit;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static testing.ui.LoginUI.TXT_USUARIO;

public class LoginCredenciales implements Task {

    public static Login conCredenciales() {
        return instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("iparada").into(TXT_USUARIO)
        );
        try {
            Thread.sleep(3000); // espera 3 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
