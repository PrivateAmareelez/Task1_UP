package entity;

/**
 * Created by amareelez on 21/02/2017.
 */
public class Postgraduate extends Student {
    private Academic supervisor;

    public Academic getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Academic supervisor) {
        this.supervisor = supervisor;
    }
}
