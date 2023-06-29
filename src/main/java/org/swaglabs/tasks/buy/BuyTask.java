package org.swaglabs.tasks.buy;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.swaglabs.interactions.ScrollTolTem;
import org.swaglabs.utils.Utils;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.swaglabs.models.BuyData.getProducts;
import static org.swaglabs.userinterfaces.BuyPage.*;

public class BuyTask implements Task {

    public static BuyTask buy() {
        return instrumented(BuyTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ScrollTolTem.untilElementWithText(Utils.convertUtf8(getProducts())),
                ScrollTolTem.untilElementWithText("AÑADIR A CARRITO"),
                Click.on(BUTTON_RETURN)
        );

    }


}
