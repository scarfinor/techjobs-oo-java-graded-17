package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    //@Override
    //public String toString() {
    //    return "JobField{" +
    //            "value='" + value + '\'' +
    //            '}';
    // }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId() && Objects.equals(getValue(), jobField.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
