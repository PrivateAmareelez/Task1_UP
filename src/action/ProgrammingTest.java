package action;

import entity.*;

import java.util.HashSet;

/**
 * Created by amareelez on 21/02/2017.
 */
public class ProgrammingTest {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Academic academic_one = new Academic(), academic_two = new Academic();
        academic_one.setName("Philip");
        academic_two.setName("Carl");

        Undergraduate undergraduate = new Undergraduate();
        undergraduate.setName("John");
        undergraduate.setTutor(academic_one);
        students.add(undergraduate);
        undergraduate = new Undergraduate();
        undergraduate.setName("William");
        undergraduate.setTutor(academic_two);
        students.add(undergraduate);

        Postgraduate postgraduate = new Postgraduate();
        postgraduate.setName("Kate");
        postgraduate.setSupervisor(academic_two);
        students.add(postgraduate);
        postgraduate = new Postgraduate();
        postgraduate.setName("Sheldon");
        postgraduate.setSupervisor(academic_one);
        students.add(postgraduate);
        postgraduate = new Postgraduate();
        postgraduate.setName("Jeany");
        postgraduate.setSupervisor(academic_two);
        students.add(postgraduate);

        Course course = new Course("Sample course", students);
        HashSet<Student> result = (HashSet<Student>) course.getPostgraduates(academic_two.getName());
        for (Student student : result)
            System.out.println(student.getName());

        Notifier notifier = new Notifier(result);
        notifier.doNotifyAll("Greetings, dear students!");
    }
}
