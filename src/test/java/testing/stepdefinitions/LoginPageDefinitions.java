package testing.stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.questions.ErrorLogin;
import testing.questions.SuccessLogin;
import testing.tasks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginPageDefinitions {

    @Then("Debe iniciar sesión correctamente")
    public void debeIniciarSesiónCorrectamente() {
        theActorInTheSpotlight().should(seeThat(SuccessLogin.loginExitoso()));
    }

    @Then("Debe ver el mensaje de error {string}")
    public void debeVerElMensajeDeError(String expectedErrorMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorLogin.porCredencialesInvalidas(expectedErrorMessage)));
    }

    @Then("Debe ver el mensaje de error {string} debajo del nombre de usuario")
    public void debeVerElMensajeDeErrorDebajoDelNombreDeUsuario(String expectedErrorMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorLogin.porNombreDeUsuarioFaltante(expectedErrorMessage)));
    }

    @When("Inicia sesión con las credenciales {string} y {string}")
    public void iniciaSesiónConLasCredencialesY(String username, String password) {
        OnStage.withCurrentActor(Login.conCredenciales(username, password));
    }

    @Then("Debe ver el mensaje de error {string} debajo de la contrasena")
    public void debeVerElMensajeDeErrorDebajoDeLaContrasena(String expectedErrorMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorLogin.porFaltaDeContrasena(expectedErrorMessage)));
    }
}
