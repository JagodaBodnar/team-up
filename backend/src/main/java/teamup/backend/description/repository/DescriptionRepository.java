package teamup.backend.description.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamup.backend.description.model.Description;

import java.util.UUID;

@Repository
public interface DescriptionRepository extends JpaRepository<Description, UUID> {
}
