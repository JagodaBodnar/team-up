package teamup.backend.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import teamup.backend.message.model.Message;
import teamup.backend.team.model.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tu_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToMany(mappedBy = "listOfUsers")
    @JsonIgnore
    private List<Team> listOfTeams = new ArrayList<>();

    private String name;

    private String phoneNumber;
    private String email;

    @OneToMany(mappedBy = "createdBy")
    private List<Team> team = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "tu_user_message",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "message_id")})
    private List<Message> listOfMessages = new ArrayList<>();
}
