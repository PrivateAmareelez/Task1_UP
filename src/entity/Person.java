package entity;

/**
 * Created by amareelez on 21/02/2017.
 */
public class Person {
    private String name;

    Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
