package pl.lodz.p.it.opinioncollector.eventHandling.events;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.ToString;
import pl.lodz.p.it.opinioncollector.userModule.user.User;

import java.util.UUID;

@Entity
@Getter
@ToString
public class AnwserNotifyEvent extends Event {
    private UUID questionID;

    public AnwserNotifyEvent(UUID eventID, User user, String description, UUID questionID) {
        super(eventID, user, description);
        this.questionID = questionID;
    }

    public AnwserNotifyEvent() {
        super();
    }
}
