package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here\
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job1.toString().contains(System.lineSeparator());
        String firstChar = String.valueOf(job1.toString().charAt(0));
        String lastChar = String.valueOf(job1.toString().charAt(job1.toString().length() - 1));
        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        String lineSeparatorString = System.lineSeparator() + "ID: 4" +System.lineSeparator()
                + "Name: Web Developer" + System.lineSeparator()
                + "Employer: LaunchCode" + System.lineSeparator()
                + "Location: StL" + System.lineSeparator()
                + "Position Type: Back-end developer" + System.lineSeparator()
                + "Core Competency: Java" + System.lineSeparator();

        assertEquals(lineSeparatorString, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Web Developer", new Employer(""), new Location("StL"), new PositionType(""), new CoreCompetency("Java"));
        String lineSeportatorString = System.lineSeparator() + "ID: 3" +System.lineSeparator()
                + "Name: Web Developer" + System.lineSeparator()
                + "Employer: Data not available" + System.lineSeparator()
                + "Location: StL" + System.lineSeparator()
                + "Position Type: Data not available" + System.lineSeparator()
                + "Core Competency: Java" + System.lineSeparator();

        assertEquals(lineSeportatorString, job.toString());
    }
}