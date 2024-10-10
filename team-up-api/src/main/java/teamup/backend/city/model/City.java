package teamup.backend.city.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import teamup.backend.location.model.Location;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private Country country;

    @ElementCollection
    @MapKeyColumn(name="lang")
    @Column(name="name")
    private Map<String, String> cityNames;

    @OneToMany
    private List<Location> locations = new ArrayList<>();
}
