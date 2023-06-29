package org.swaglabs.userinterfaces;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class LoginPage {

    public static final Locator INPUT_USER_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.EditText[@content-desc='test-Usuario']")
            .withIosAccesibilityId("1");

    public static final Locator INPUT_PASS_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.EditText[@content-desc='test-Contraseña']")
            .withIosAccesibilityId("1");

    public static final Locator BUTTON_LOGIN_LOCATOR = locator()
            .withAndroidXpathStatic("//android.view.ViewGroup[@content-desc='test-LOGIN']")
            .withIosAccesibilityId("1");

    public static final Locator SUCCESSFUL_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.TextView[contains(@text,'PRODUCTOS')]")
            .withIosAccesibilityId("1");

    public static final Target INPUT_USER = Target.the("Input user").located(theElementBy(INPUT_USER_LOCATOR));
    public static final Target INPUT_PASSWORD = Target.the("Input password").located(theElementBy(INPUT_PASS_LOCATOR));
    public static final Target BUTTON_LOGIN = Target.the("Button login").located(theElementBy(BUTTON_LOGIN_LOCATOR));
    public static final Target SUCCESSFUL = Target.the("Result").located(theElementBy(SUCCESSFUL_LOCATOR));




}
