package co.com.choucair.certification.proyecto.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    public static final Target BTN_INGRESAR_DATOS = Target.the("Boton para ingresar al registro")
            .located(By.xpath("//*[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
    public static final Target TXT_NOMBRE = Target.the("Ingresar Nombre").located(By.id("firstName"));
    public static final Target TXT_APELLIDO = Target.the("Ingresar Apellido").located(By.id("lastName"));
    public static final Target TXT_EMAIL = Target.the("Ingresar Email").located(By.id("email"));
    public static final Target SLC_MES = Target.the("Seleccionar Mes").located(By.xpath("//option[contains(text(),'February')]"));
    public static final Target SLC_DIA = Target.the("Seleccionar Dia").located(By.xpath("//select[@id='birthDay']//*[contains(@label,'14')]"));
    public static final Target SLC_ANO = Target.the("Seleccionar año").located(By.xpath("//*[contains(@label,'1991')]"));
    public static final Target BTN_SIG_UBICACION = Target.the("Seleccionar año").located(By.xpath("//span[contains(text(),'Next: Location')]"));

    public static final Target BTN_SIG_DISPOSITIVO = Target.the("Siguiente Dispositivos").located(By.xpath("//span[contains(text(),'Next: Devices')]"));

    public static final Target BTN_SIG_PASO = Target.the("Siguiente ultimo Paso").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

    public static final Target TXT_CLAVE = Target.the("Campo ingresar clave").located(By.id("password"));
    public static final Target TXT_CONFIRMAR_CLAVE = Target.the("Campo confirmar clave").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMINOS = Target.the("Aceptar terminos").located(By.xpath("//*[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]"));
    public static final Target CHECK_POLITICAS = Target.the("Aceptar politicas").located(By.xpath("//*[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));

    public static final Target BTN_INFO_COMPLETA = Target.the("Informacion completa").located(By.xpath("//a[@id='laddaBtn']"));

    public static final Target TXT_VALIDAR_CREACION = Target.the("Validar Creacion Usuario").located(By.xpath("//span[contains(text(),'Complete Setup')]"));



}