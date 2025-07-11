package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static testing.ui.LoginUI.TXT_CLAVE;
import static testing.ui.LoginUI.TXT_USUARIO;

public class LoginCredenciales implements Task {

    public static LoginCredenciales conCredenciales() {
        return instrumented(LoginCredenciales.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("iparada").into(TXT_USUARIO),
                Enter.theValue("123456").into(TXT_CLAVE)
        );
        try {
            Thread.sleep(3000); // espera 3 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
