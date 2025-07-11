package testing.stepdefinitions;

import io.cucumber.java.en.When;
import testing.tasks.LoginCredenciales;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginDefinitions {

    @When("el especialista digita su usuario y contraseña correcto")
    public void digitarCredenciales() {
        theActorInTheSpotlight().attemptsTo(LoginCredenciales.conCredenciales());
    }
}
