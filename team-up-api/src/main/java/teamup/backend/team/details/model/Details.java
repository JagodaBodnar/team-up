package teamup.backend.team.details.model;

import jakarta.persistence.*;
import teamup.backend.team.model.Team;


import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String description;

    private String rules;
    private BigDecimal payment;

    @OneToOne(mappedBy = "details")
    private Team team;
}
