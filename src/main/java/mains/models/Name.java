package mains.models;

import java.util.Comparator;
import java.util.Objects;

public class Name implements Comparable {

    String fullname;

    public Name(String name) {
        this.fullname = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(fullname, name.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullname);
    }

    @Override
    public String toString() {
        return "Name{" +
                "fullname='" + fullname + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Name) { // Ensure the object is of the same class
            Name other = (Name) o;
            return this.fullname.compareTo(other.fullname); // Compare the names using String's compareTo
        } else {
            throw new ClassCastException("Cannot compare objects of different types"); // Handle invalid comparisons
        }
    }

}
