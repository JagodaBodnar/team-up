package teamup.backend.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamup.backend.user.model.User;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository <User, UUID> {
}
