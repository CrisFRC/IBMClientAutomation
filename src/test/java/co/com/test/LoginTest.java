package co.com.test;

import interactions.EnterValueI;
import interactions.SendKeys;
import org.junit.Test;
import targets.Coordinate;
import targets.Target;
import tasks.OpenEmulator;

public class LoginTest {

    @Test
    public void testLogin() {
        String user = "CCFROA";
        String pass = "cfroa0626";
        OpenEmulator.openTerminalEmulator("src/main/resources/sessions/CALIDAD.EDP");
        //object user definition
        Target userTarget = Target.the("user")
                .locatedByCoordinate(Coordinate.withRow(6)
                        .withInitialColumn(53).andLength(user.length()));
        EnterValueI userValue = new EnterValueI(user, userTarget);

        //object pass definition
        Target passTarget = Target.the("pass")
                .locatedByCoordinate(Coordinate.withRow(7)
                        .withInitialColumn(53).andLength(pass.length()));
        EnterValueI passValue = new EnterValueI(pass, passTarget);
        //enter objects
        userValue.enterValue();
        passValue.enterValue();
        SendKeys.sendKeys("ENTER");
    }

}
