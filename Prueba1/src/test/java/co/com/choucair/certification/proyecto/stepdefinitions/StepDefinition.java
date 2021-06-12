package co.com.choucair.certification.proyecto.stepdefinitions;

import co.com.choucair.certification.proyecto.model.Datos;
import co.com.choucair.certification.proyecto.questions.Validar;
import co.com.choucair.certification.proyecto.tasks.Open;
import co.com.choucair.certification.proyecto.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class StepDefinition {

    @Before
    public void DoSomethingBefore() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Andres");
    }

    @Dado("^que Andres quiere acceder a la Web Automation Utest$")
    public void queAndresQuiereAccederALaWebAutomationUtest() {
        OnStage.theActorCalled("Andres").wasAbleTo(Open.LaPaginaUtest());
    }

    @Cuando("^el realiza el registro en la pagina$")
    public void elRealizaElRegistroEnLaPagina(List<Datos> datosP) {
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.IngresaInformacion(datosP.get(0)));
    }

    @Entonces("^el verifica que se carga la pantalla correctamente (.*)$")
    public void elVerificaQueSeCargaLaPantallaCorrectamente(String textoValidacion) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.creacionUsuario(), org.hamcrest.Matchers.containsString(textoValidacion)));
    }
}