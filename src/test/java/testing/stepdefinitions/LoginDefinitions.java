package testing.stepdefinitions;

import io.cucumber.java.en.When;
import testing.questions.SuccessLogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginDefinitions {



    @When("el especialista digita su usuario y contraseña correcto")
    public void digitarCredenciales() {
        theActorInTheSpotlight().should(seeThat(SuccessLogin.loginExitoso()));
    }
}
