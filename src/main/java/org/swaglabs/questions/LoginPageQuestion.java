package org.swaglabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.swaglabs.userinterfaces.LoginPage;

public class LoginPageQuestion implements Question<String> {

    public static LoginPageQuestion succesful(){
        return new LoginPageQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LoginPage.SUCCESSFUL).viewedBy(actor).asString();
    }


}

