package testing.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import testing.questions.TextoQuestion;
import testing.tasks.LoginCredenciales;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static testing.ui.LoginUI.MNJ_TITULO;
import static testing.ui.LoginUI.TITULO;

public class LoginDefinitions {

    @When("el especialista digita su usuario y contraseña correcto")
    public void digitarCredenciales() {
        theActorInTheSpotlight().attemptsTo(LoginCredenciales.conCredenciales());
    }

    @Then("valida el texto de la pagina")
    public void verificaTexto() {
        theActorInTheSpotlight().should(
                seeThat(TextoQuestion.title(TITULO), Matchers.equalTo(MNJ_TITULO))
        );
    }
}
