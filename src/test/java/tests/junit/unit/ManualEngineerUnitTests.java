package tests.junit.unit;

import org.junit.Test;
import people.ManualEngineer;

import static org.junit.Assert.assertEquals;

public class ManualEngineerUnitTests {
    @Test
    public void testGetAge() {
        ManualEngineer manualEngineer = new ManualEngineer(25,2,3);
        assertEquals("The age is not correct!",25, manualEngineer.getAge());
    }

    @Test
    public void testGetSkill() {
        ManualEngineer manualEngineer = new ManualEngineer(25,2,3);
        assertEquals("The skill is not correct!",6, manualEngineer.getSkill());
    }

    @Test
    public void testGetExperience() {
        ManualEngineer manualEngineer = new ManualEngineer(25,2,3);
        assertEquals("The experience is not correct!",3, manualEngineer.getExperience());
    }

    @Test
    public void testSetAge() {
        ManualEngineer manualEngineer = new ManualEngineer(25,2,3);
        manualEngineer.setAge(30);
        assertEquals("The age is not correct!", 30, manualEngineer.getAge());
    }

    @Test
    public void testSetSkill() {
        ManualEngineer manualEngineer = new ManualEngineer(25,3,3);
        manualEngineer.setSkill(4);
        assertEquals("The skill is not correct!",4, manualEngineer.getSkill());
    }

    @Test
    public void testSetExperience() {
        ManualEngineer manualEngineer = new ManualEngineer(25,2,3);
        manualEngineer.setExperience(4);
        assertEquals("The experience is not correct!",4, manualEngineer.getExperience());
    }
}
