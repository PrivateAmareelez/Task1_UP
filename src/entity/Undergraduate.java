package entity;

/**
 * Created by amareelez on 21/02/2017.
 */
public class Undergraduate extends Student {
    private Academic tutor;

    public Academic getTutor() {
        return tutor;
    }

    public void setTutor(Academic tutor) {
        this.tutor = tutor;
    }
}
