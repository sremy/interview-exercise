package exoMap;

public class ParentsChildren {

    String name;
    String firstName;
    String childFirstName;

    public ParentsChildren(String name, String firstName, String childFirstName) {
        this.name = name;
        this.firstName = firstName;
        this.childFirstName = childFirstName;
    }

    @Override
    public String toString() {
        return "ParentsChildren{" +
                "nom='" + name + '\'' +
                ", prenom='" + firstName + '\'' +
                ", prenomEnfant='" + childFirstName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getChildFirstName() {
        return childFirstName;
    }
}
