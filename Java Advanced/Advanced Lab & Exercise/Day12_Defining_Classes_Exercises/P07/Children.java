package Day12_Defining_Classes_Exercises.P07;

public class Children {
    private String childName;
    private String childBirthday;

    public Children(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    public String getChildName() {
        return childName;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getChildName(), getChildBirthday());
    }
}