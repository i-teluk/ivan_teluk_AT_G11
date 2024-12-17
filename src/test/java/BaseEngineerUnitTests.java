import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import people.AutomatedEngineer;
import people.Engineer;
import people.ManualEngineer;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BaseEngineerUnitTests {
    @Parameterized.Parameter()
    public Engineer en;

    @Parameterized.Parameter(1)
    public int expectedSkill;


    @Parameterized.Parameters
    public static Collection<Object[]> engineers() {
        return Arrays.asList(new Object[][] {
                {new ManualEngineer(25,2,3), 6},
                {new AutomatedEngineer(25,2,3), 9}
        });
    }

    @Test
    public void test01_GetAge() {
        assertEquals("The age is not correct!",25, en.getAge());
    }

    @Test
    public void test02_GetSkill() {
        assertEquals("The skill is not correct!", expectedSkill, en.getSkill());
    }

    @Test
    public void test03_GetExperience() {
        assertEquals("The experience is not correct!",3, en.getExperience());
    }

    @Test
    public void test04_SetAge() {
        en.setAge(30);
        assertEquals("The age is not correct!", 30, en.getAge());
    }

    @Test
    public void test05_SetSkill() {
        en.setSkill(4);
        assertEquals("The skill is not correct!",4, en.getSkill());
    }

    @Test
    public void test06_SetExperience() {
        en.setExperience(4);
        assertEquals("The experience is not correct!",4, en.getExperience());
    }
}
