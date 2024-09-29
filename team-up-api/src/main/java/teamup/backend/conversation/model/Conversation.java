package teamup.backend.conversation.model;

import jakarta.persistence.*;
import teamup.backend.message.model.Message;
import teamup.backend.user.model.User;

import java.util.List;
import java.util.UUID;

@Entity
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToMany(mappedBy = "listOfConversations")
    private List<User> listOfUsers;

    @OneToMany(mappedBy = "conversation")
    private List<Message> listOfMessages;
}
