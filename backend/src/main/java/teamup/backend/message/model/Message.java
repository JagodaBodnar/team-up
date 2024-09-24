package teamup.backend.message.model;

import jakarta.persistence.*;
import teamup.backend.user.model.User;

import java.util.List;
import java.util.UUID;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String text;

    @ManyToMany(mappedBy = "listOfMessages")
    private List<User> user;
}
