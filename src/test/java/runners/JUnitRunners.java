package runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.junit.unit.AutomatedEngineerUnitTests;
import tests.junit.unit.BaseEngineerUnitTests;
import tests.junit.unit.ManualEngineerUnitTests;
import tests.junit.webdriver.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomatedEngineerUnitTests.class,
        ManualEngineerUnitTests.class,
        BaseEngineerUnitTests.class,
        BookingJS.class,
        BookingPrague.class,
        BookingParis.class,
        BookingTooltips.class,
        GetWeather.class,
        //SelectTest.class,
        //TutorialTest.class
})
public class JUnitRunners {
}
