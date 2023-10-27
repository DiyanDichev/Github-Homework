package Day14_Objects_and_Classes;

public class P05_Students_Class {
private String firstName;
private String lastName;
private int age;
private String homeTown;

public P05_Students_Class(String firstName, String lastName, int age, String homeTown){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.homeTown = homeTown;
}

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return this.homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getDetails(){
    return String.format("%s %s is %d years old",this.firstName,this.lastName,this.age);
    }

}
