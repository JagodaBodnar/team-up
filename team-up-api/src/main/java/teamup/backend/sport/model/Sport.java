package teamup.backend.sport.model;

import jakarta.persistence.*;
import teamup.backend.team.model.Team;

import java.util.UUID;

@Entity
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private SportCode code;
    private String icon;

    @ManyToOne
    @JoinColumn(name="sport_id")
    private Team team;
}
