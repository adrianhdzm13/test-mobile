package org.swaglabs.userinterfaces;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;


import org.swaglabs.utils.Utils;
import org.openqa.selenium.By;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;
import static org.swaglabs.models.BuyData.getProducts;

public class BuyPage {

    public static final Locator BUTTON_CAR_LOCATOR = locator()
            .withAndroidXpathStatic("//android.widget.TextView[contains(@text,'AÑADIR A CARRITO')]")
            .withIosAccesibilityId("1");

    public static final Target BUTTON_CAR = Target.the("Add product cart").located(theElementBy(BUTTON_CAR_LOCATOR));

    public static final Target PRODUCTS = Target.the("Title Modal LoginPage").located(By.xpath("//android.widget.TextView[contains(@text,'"+Utils.convertUtf8(getProducts())+"')]"));

    public static final Target BUTTON_RETURN = Target.the("Return to products").located(By.xpath("//android.widget.TextView[contains(@text,'REGRESO A PRODUCTOS')]"));
    public static final Target SELECT_CART = Target.the("Select cart products").located(By.xpath("//android.view.ViewGroup[@content-desc='test-Carrito']"));
    public static final Target BUTTON_CHECKOUT = Target.the("Select Button CHECKOUT ").located(By.xpath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']"));
    public static final Target INPUT_NAME = Target.the("Input name").located(By.xpath("//android.widget.EditText[@content-desc='test-Nombre']"));
    public static final Target INPUT_LASTNAME = Target.the("Input last name").located(By.xpath("//android.widget.EditText[@content-desc='test-Apellido']"));
    public static final Target INPUT_POSTALCOD = Target.the("Input postal code").located(By.xpath("//android.widget.EditText[@content-desc='test-Código postal']"));
    public static final Target BUTTON_CONTINUE = Target.the("Button continue").located(By.xpath("//android.view.ViewGroup[@content-desc='test-CONTINUAR']"));
    public static final Target BUTTON_FN = Target.the("Button finish").located(By.xpath("//android.view.ViewGroup[@content-desc='test-TERMINAR']"));
    public static final Target RESULT_FINISH = Target.the("Result finish the buy").located(By.xpath("//android.widget.TextView[contains(@text,'GRACIAS POR SU ORDEN')]"));




}


