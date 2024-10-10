package teamup.backend.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teamup.backend.location.model.Location;
import java.util.UUID;

public interface LocationRepository extends JpaRepository<Location, UUID> {
}
