package org.swaglabs.tasks.buy;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.swaglabs.interactions.ScrollTolTem;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.swaglabs.userinterfaces.BuyPage.*;

public class BuyPayCart implements Task {

    private String name;
    private String lastName;
    private String postalCode;

    public BuyPayCart(String name, String lastName, String postalCode) {
        this.name = name;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static BuyPayCart buyPayCart(String name, String lastName, String postalCode) {
        return instrumented(BuyPayCart.class, name,lastName,postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ScrollTolTem.untilElementWithText("CHECKOUT"),
                Enter.theValue(name).into(INPUT_NAME),
                Enter.theValue(lastName).into(INPUT_LASTNAME),
                Enter.theValue(postalCode).into(INPUT_POSTALCOD),
                Click.on(BUTTON_CONTINUE),
                ScrollTolTem.untilElementWithText("TERMINAR")
        );
    }
}