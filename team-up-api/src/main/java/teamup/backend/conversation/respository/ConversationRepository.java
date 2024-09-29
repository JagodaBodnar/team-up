package teamup.backend.conversation.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teamup.backend.conversation.model.Conversation;

import java.util.UUID;
@Repository
public interface ConversationRepository extends JpaRepository<Conversation, UUID> {
}
