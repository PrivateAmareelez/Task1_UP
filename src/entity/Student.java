package entity;

/**
 * Created by amareelez on 21/02/2017.
 */
public class Student extends Person implements Notifiable {
    private String login, email;

    protected Student() {
    }

    public Student(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void notify(String message) {
    }
}
