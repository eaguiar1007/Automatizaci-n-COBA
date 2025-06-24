package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

public class LoginUI {




    //cssSelector, shadowHost1, shadowHost2)
    public static final Target TXT_USUARIO = Target.the("campo usuario")
            .located(ByShadow.cssSelector(
                    "input#user", // Selector dentro del último Shadow DOM
                    "sp-tp-xcenter-login-form", // Shadow Host 1 (más externo)
                    "sp-ml-xcenter-login-form", // Shadow Host 2
                    "sp-at-input" // Shadow Host 3 (más interno)
            ));
}
