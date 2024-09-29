package teamup.backend.team.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamup.backend.team.details.model.Details;

import java.util.UUID;

@Repository
public interface DetailsRepository extends JpaRepository<Details, UUID> {
}
