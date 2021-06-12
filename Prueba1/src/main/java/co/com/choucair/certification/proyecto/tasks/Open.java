package co.com.choucair.certification.proyecto.tasks;

import co.com.choucair.certification.proyecto.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Open implements Task {
    private UtestPage utestPage;
    public static Performable LaPaginaUtest() {
        return Tasks.instrumented(Open.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));
    }
}