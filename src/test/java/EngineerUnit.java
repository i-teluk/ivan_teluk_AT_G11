import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutomatedEngineerUnitTests.class,
        ManualEngineerUnitTests.class,
        BaseEngineerUnitTests.class
})
public class EngineerUnit {
}
