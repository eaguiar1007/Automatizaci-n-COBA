package testing.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    private LoginPage() { }

    public static final Target SUBMIT_BUTTON = Target.the("Boton login")
            .locatedBy("//*[@id=\"sp-ml-xcenter-login-form\"]/div[4]/button");
    public static final Target ERROR_MESSAGE = Target.the("Mensaje de error")
            .locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
    public static final Target MISSING_USERNAME = Target.the("Mensaje de error por usuario faltante")
            .locatedBy("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
    public static final Target USERNAME = Target.the("Campo de usuario")
            .located(By.xpath ("//*[@id=\"user\"]"));
    public static final Target PASSWORD = Target.the("Campo de contraseña")
            .located(By.xpath("//*[@id=\"password\"]"));
    public static final Target MISSING_PASSWORD = Target.the("Mensaje de error por contraseña faltante")
            .locatedBy("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");
}
