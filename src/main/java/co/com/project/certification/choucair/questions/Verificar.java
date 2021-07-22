package co.com.project.certification.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.project.certification.choucair.userinterface.NuestrasVacantesPage.*;

public class Verificar implements Question<Boolean> {
    private String resultado;

    public Verificar(String resultado) {
        this.resultado = resultado;
    }

    public static Verificar resultadoEs(String mjsEsperado) {
        return new Verificar(mjsEsperado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelOfertaLaboral = Text.of(LABEL_VACANTES).viewedBy(actor).asString();
        System.out.println(labelOfertaLaboral);
        return resultado.equalsIgnoreCase(labelOfertaLaboral);
    }
}
