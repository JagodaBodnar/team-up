package teamup.backend.description.model;

import jakarta.persistence.*;
import teamup.backend.team.model.Team;


import java.util.UUID;

@Entity
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;

    private String rules;
    private float payment;

    @OneToOne(mappedBy = "description")
    private Team team;
}
