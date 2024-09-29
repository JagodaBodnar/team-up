package teamup.backend.location.model;

import jakarta.persistence.*;
import lombok.Data;
import teamup.backend.team.model.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String street;
    private String city;
    private String country;
    private String location_name;

    @OneToMany(mappedBy = "location")
    private List<Team> listOfTeams = new ArrayList<Team>();
}
