package Day15_Object_and_Classes_Exercise.P03_Opinion_Poll;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
