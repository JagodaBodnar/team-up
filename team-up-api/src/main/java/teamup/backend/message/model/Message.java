package teamup.backend.message.model;

import jakarta.persistence.*;
import teamup.backend.conversation.model.Conversation;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String text;
    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name="listOfMessages")
    private Conversation conversation;
}
