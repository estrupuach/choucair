package co.com.user.questions;

import co.com.user.userinterface.Title;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String getStrTitle;

    public Answer(String question) {
        this.getStrTitle = question;
    }

    public static Answer toThe(String getStrTitle) {
        return new Answer(getStrTitle);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String welcomeTitle= Text.of(Title.WELCOME_TITLE).viewedBy(actor).asString();
        //System.out.println("Inicia Questions ->"+getStrTitle+" <-Termina questions");
        //System.out.println("Inicia Title ->"+welcomeTitle+" <-Termina title");
        if(getStrTitle.equals(welcomeTitle)){
            System.out.println("LOS MENSAJES COINCIDEN");
            return true;}
        else{
            System.out.println("LOS MENSAJES NOOO COINCIDEN");
            return false;}
    }
}
