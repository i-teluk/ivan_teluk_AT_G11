import org.testng.annotations.Test;
import people.ManualEngineer;

import static org.testng.Assert.assertEquals;

public class ManualEngineerNGTests {
    @Test
    public void testGetAge() {
        ManualEngineer manualEngineer = new ManualEngineer(25,2,3);
        assertEquals(manualEngineer.getAge(), 25, "The age is not correct!");
    }

    @Test
    public void testGetSkill() {
        ManualEngineer manualEngineer = new ManualEngineer(25,2,3);
        assertEquals(manualEngineer.getSkill(), 6, "The skill is not correct!");
    }

    @Test
    public void testGetExperience() {
        ManualEngineer manualEngineer = new ManualEngineer(25,2,3);
        assertEquals(manualEngineer.getExperience(), 3,"The experience is not correct!");
    }

    @Test
    public void testSetAge() {
        ManualEngineer manualEngineer = new ManualEngineer(25,2,3);
        manualEngineer.setAge(30);
        assertEquals(manualEngineer.getAge(), 30, "The age is not correct!");
    }

    @Test
    public void testSetSkill() {
        ManualEngineer manualEngineer = new ManualEngineer(25,3,3);
        manualEngineer.setSkill(4);
        assertEquals(manualEngineer.getSkill(), 4, "The skill is not correct!");
    }

    @Test
    public void testSetExperience() {
        ManualEngineer manualEngineer = new ManualEngineer(25,2,3);
        manualEngineer.setExperience(4);
        assertEquals(manualEngineer.getExperience(), 4,"The experience is not correct!");
    }
}
