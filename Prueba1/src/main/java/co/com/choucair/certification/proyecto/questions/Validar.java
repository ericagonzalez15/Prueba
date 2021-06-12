package co.com.choucair.certification.proyecto.questions;

import co.com.choucair.certification.proyecto.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question<String> {


    public static Validar creacionUsuario() {
        return new Validar();
    }

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(HomePage.TXT_VALIDAR_CREACION).viewedBy(actor).asString();

    }
}