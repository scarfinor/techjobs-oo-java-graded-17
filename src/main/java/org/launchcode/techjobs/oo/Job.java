package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.\

    @Override
    public String toString() {
        String lineSeparator = System.lineSeparator();

        lineSeparator += "ID: " + (id != 0 ? id : "Data not available") + lineSeparator();
        lineSeparator += "Name: " + (name != null && !name.isEmpty() ? name : "Data not available") + lineSeparator();
        lineSeparator += "Employer: " + (employer != null && !employer.getValue().isEmpty() ? employer : "Data not available") + lineSeparator();
        lineSeparator += "Location: " + (location != null && !location.getValue().isEmpty() ? location : "Data not available") + lineSeparator();
        lineSeparator += "Position Type: " + (positionType != null && !positionType.getValue().isEmpty() ? positionType : "Data not available") + lineSeparator();
        lineSeparator += "Core Competency: " + (coreCompetency != null && !coreCompetency.getValue().isEmpty() ? coreCompetency : "Data not available");

        lineSeparator += lineSeparator();

        if (id != 0 &&
                (name == null || name.isEmpty()) &&
                (employer == null || employer.getValue().isEmpty()) &&
                (location == null || location.getValue().isEmpty()) &&
                (positionType == null || positionType.getValue().isEmpty()) &&
                (coreCompetency == null || coreCompetency.getValue().isEmpty())) {
            return "OOPS! This job does not seem to exist.";
        }

        return lineSeparator;
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
}

