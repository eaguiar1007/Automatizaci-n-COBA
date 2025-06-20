package testing.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    private HomePage() { }

    public static final Target DASHBOARD_TEXT = Target.the("Mensaje de bienvenida")
            .locatedBy(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");

}

