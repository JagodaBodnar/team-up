package teamup.backend.message.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import teamup.backend.conversation.model.Conversation;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Size(max=1000)
    private String content;
    private LocalDateTime sendDate;

    @ManyToOne
    @JoinColumn(name="listOfMessages")
    private Conversation conversation;
}
