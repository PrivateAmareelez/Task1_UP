package entity;

import java.util.AbstractSet;
import java.util.HashSet;

/**
 * Created by amareelez on 21/02/2017.
 */
public class Course {
    private String name;
    private HashSet<Student> students;

    public Course(String name, HashSet<Student> students) {
        this.name = name;
        this.students = students;
    }

    public AbstractSet<Student> getPostgraduates(String nameOfSupervisor) {
        HashSet<Student> postgraduates = new HashSet<>();
        for (Student student : students) {
            if (student instanceof Postgraduate && ((Postgraduate) student).getSupervisor().getName().equals(nameOfSupervisor))
                postgraduates.add(student);
        }
        return postgraduates;
    }
}
