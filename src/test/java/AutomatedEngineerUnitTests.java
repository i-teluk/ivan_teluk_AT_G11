import org.junit.Test;
import people.AutomatedEngineer;

import static org.junit.Assert.assertEquals;

public class AutomatedEngineerUnitTests {
    @Test
    public void testGetAge() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,2,3);
        assertEquals("The age is not correct!",25, automatedEngineer.getAge());
    }

    @Test
    public void testGetSkill() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,2,3);
        assertEquals("The skill is not correct!",9, automatedEngineer.getSkill());
    }

    @Test
    public void testGetExperience() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,2,3);
        assertEquals("The experience is not correct!",3, automatedEngineer.getExperience());
    }

    @Test
    public void testSetAge() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,2,3);
        automatedEngineer.setAge(30);
        assertEquals("The age is not correct!", 30, automatedEngineer.getAge());
    }

    @Test
    public void testSetSkill() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,3,3);
        automatedEngineer.setSkill(4);
        assertEquals("The skill is not correct!",4, automatedEngineer.getSkill());
    }

    @Test
    public void testSetExperience() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,2,3);
        automatedEngineer.setExperience(4);
        assertEquals("The experience is not correct!",4, automatedEngineer.getExperience());
    }
}
