package teamup.backend.team.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import teamup.backend.location.model.Location;
import teamup.backend.sport.model.Sport;
import teamup.backend.team.details.model.Details;
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

    @ManyToOne
    @JoinColumn(name="location_id")
    private Location location;

    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name="created_by")
    private User createdBy;

    private boolean openGroup;

    @OneToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Details details;

    @OneToOne
    @JoinColumn(name = "sport")
    private Sport sport;

    @ManyToMany
    @JoinTable(name = "tu_team_user",
            joinColumns = {@JoinColumn(name = "team_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private List<User> listOfUsers = new ArrayList<>();
}
