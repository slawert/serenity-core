package net.serenitybdd.screenplay.actions.selectactions;

import net.serenitybdd.screenplay.Action;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class SelectByValueFromTarget implements Action {
    private final Target target;
    private final String value;

    public SelectByValueFromTarget(Target target, String value) {
        this.target = target;
        this.value = value;
    }

    @Step("{0} clicks on #target")
    public <T extends Actor> void performAs(T theUser) {
        target.resolveFor(theUser).selectByVisibleText(value);
    }


}
