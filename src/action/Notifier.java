package action;

import entity.Notifiable;

import java.util.HashSet;

/**
 * Created by amareelez on 21/02/2017.
 */
public class Notifier {
    private HashSet<? extends Notifiable> notifiables;

    public Notifier(HashSet<? extends Notifiable> notifiables) {
        this.notifiables = notifiables;
    }

    public void doNotifyAll(String message) {
        for (Notifiable item : notifiables)
            item.notify(message);
    }
}
