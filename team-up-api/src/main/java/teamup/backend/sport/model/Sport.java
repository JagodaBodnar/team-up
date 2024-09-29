package teamup.backend.sport.model;

import jakarta.persistence.*;
import teamup.backend.team.model.Team;

import java.util.UUID;

@Entity
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private long code;
    private String icon;

    @OneToOne(mappedBy="sport")
    private Team team;
}
