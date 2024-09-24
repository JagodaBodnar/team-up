package teamup.backend.team.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import teamup.backend.description.model.Description;
import teamup.backend.user.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tu_team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private int teamSize;

    @Enumerated(EnumType.STRING)
    private Sport sportCategory;

    private String location;

    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name="createdBy")
    private User createdBy;

    private boolean openGroup;

    @OneToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Description description;

    @ManyToMany
    @JoinTable(name = "tu_team_user",
            joinColumns = {@JoinColumn(name = "team_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private List<User> listOfUsers = new ArrayList<>();
}
