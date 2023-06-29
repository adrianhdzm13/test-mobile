package org.swaglabs.interactions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ScrollTolTem implements Interaction {
    private String textElement;

    public ScrollTolTem(String textoElemento) {
        this.textElement = textoElemento;
    }

    public static Performable untilElementWithText(String textoElemento) {
        return Tasks.instrumented(ScrollTolTem.class, textoElemento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver<MobileElement> driver = (AppiumDriver<MobileElement>) BrowseTheWeb.as(actor).getDriver();

        MobileElement elemento = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
                        + "new UiSelector().textMatches(\""+textElement+"\").instance(0))"));

        int centerX = elemento.getLocation().getX() + (elemento.getSize().getWidth() / 2);
        int centerY = elemento.getLocation().getY() + (elemento.getSize().getHeight() / 2);
        new TouchAction<>(driver).press(PointOption.point(centerX, centerY)).release().perform();
    }
}
