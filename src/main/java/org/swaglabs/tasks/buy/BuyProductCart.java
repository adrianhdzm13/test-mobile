package org.swaglabs.tasks.buy;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.swaglabs.userinterfaces.BuyPage.SELECT_CART;

public class BuyProductCart implements Task {

    public static BuyProductCart buyProductCart() {
        return instrumented(BuyProductCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_CART)
        );
    }


}