package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static testing.ui.LoginUI.*;

public class LoginCredenciales implements Task {

    public static LoginCredenciales conCredenciales() {
        return instrumented(LoginCredenciales.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("iparada").into(TXT_USUARIO),
                Enter.theValue("Bogota123*").into(TXT_CLAVE),
                Click.on(BTN_INGRESAR)
        );
        try {
            Thread.sleep(8000); // espera 3 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
