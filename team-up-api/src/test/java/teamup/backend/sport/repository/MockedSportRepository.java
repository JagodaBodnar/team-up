package teamup.backend.sport.repository;

import teamup.backend.sport.model.Sport;
import teamup.backend.sport.model.SportCode;
import java.util.UUID;

public class MockedSportRepository {
    public static Sport createNewSport() {
        return new Sport(UUID.fromString("9b5dcb09-bd42-4306-a964-da0727c44a68"),
                SportCode.VOLLEYBALL,
                "volleyball.svg");
    }
}
