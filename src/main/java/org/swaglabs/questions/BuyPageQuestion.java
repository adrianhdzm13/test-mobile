package org.swaglabs.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.swaglabs.userinterfaces.BuyPage;

public class BuyPageQuestion implements Question<String> {

    public static BuyPageQuestion succesfulPay() {
        return new BuyPageQuestion();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(BuyPage.RESULT_FINISH).viewedBy(actor).asString();
    }
}