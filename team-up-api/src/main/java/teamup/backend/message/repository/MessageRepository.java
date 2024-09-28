package teamup.backend.message.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teamup.backend.message.model.Message;

import java.util.UUID;

public interface MessageRepository extends JpaRepository<Message, UUID> {
}
