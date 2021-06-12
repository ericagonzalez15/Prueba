package co.com.choucair.certification.proyecto.tasks;

import co.com.choucair.certification.proyecto.model.Datos;
import co.com.choucair.certification.proyecto.userinterface.HomePage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Registro implements Task {

    private Datos datosP;

    public Registro(Datos datosP) {
        this.datosP=datosP;
    }

    public static Registro IngresaInformacion(Datos datosP) {
        return Tasks.instrumented(Registro.class, datosP);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.BTN_INGRESAR_DATOS),
                Enter.theValue(datosP.getStrNombre()).into(HomePage.TXT_NOMBRE),
                Enter.theValue(datosP.getStrApellido()).into(HomePage.TXT_APELLIDO),
                Enter.theValue(datosP.getStrEmail()).into(HomePage.TXT_EMAIL),
                Click.on(HomePage.SLC_MES),
                Click.on(HomePage.SLC_DIA),
                Click.on(HomePage.SLC_ANO),
                WaitUntil.the(HomePage.BTN_SIG_UBICACION, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(HomePage.BTN_SIG_UBICACION),
                WaitUntil.the(HomePage.BTN_SIG_DISPOSITIVO, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(HomePage.BTN_SIG_DISPOSITIVO),
                WaitUntil.the(HomePage.BTN_SIG_PASO, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(HomePage.BTN_SIG_PASO),
                WaitUntil.the(HomePage.TXT_CLAVE, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(datosP.getStrClave()).into(HomePage.TXT_CLAVE),
                Enter.theValue(datosP.getStrConfirmarClave()).into(HomePage.TXT_CONFIRMAR_CLAVE),
                Click.on(HomePage.CHECK_TERMINOS),
                Click.on(HomePage.CHECK_POLITICAS));
    }
}