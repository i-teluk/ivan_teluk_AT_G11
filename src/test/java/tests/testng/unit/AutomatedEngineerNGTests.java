package tests.testng.unit;

import org.testng.annotations.Test;
import people.AutomatedEngineer;

import static org.testng.Assert.assertEquals;

public class AutomatedEngineerNGTests {
    @Test
    public void testGetAge() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,2,3);
        assertEquals(automatedEngineer.getAge(), 25, "The age is not correct!");
    }

    @Test
    public void testGetSkill() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,2,3);
        assertEquals(automatedEngineer.getSkill(), 9, "The skill is not correct!");
    }

    @Test
    public void testGetExperience() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,2,3);
        assertEquals(automatedEngineer.getExperience(), 3,"The experience is not correct!");
    }

    @Test
    public void testSetAge() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,2,3);
        automatedEngineer.setAge(30);
        assertEquals(automatedEngineer.getAge(), 30, "The age is not correct!");
    }

    @Test
    public void testSetSkill() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,3,3);
        automatedEngineer.setSkill(4);
        assertEquals(automatedEngineer.getSkill(), 4, "The skill is not correct!");
    }

    @Test
    public void testSetExperience() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(25,2,3);
        automatedEngineer.setExperience(4);
        assertEquals(automatedEngineer.getExperience(), 4,"The experience is not correct!");
    }
}
