package teamup.backend.sport.repository;

import teamup.backend.conversation.model.Conversation;
import teamup.backend.location.model.Location;
import teamup.backend.sport.model.Sport;
import teamup.backend.sport.model.SportCode;
import teamup.backend.team.details.model.Details;
import teamup.backend.team.model.Team;
import teamup.backend.user.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MockedSportRepository {
    public static Sport createNewSport() {
        List<Team> teams = new ArrayList<>();
        List<Conversation> conversations = new ArrayList<>();
        List<Sport> sports = new ArrayList<>();
        List<User> users = new ArrayList<>();
        return new Sport(UUID.fromString("9b5dcb09-bd42-4306-a964-da0727c44a68"),
                SportCode.VOLLEYBALL,
                "volleyball.svg",
                new Team(UUID.fromString("ab09d389-ff36-43ed-8b2b-4892438e46af"),
                        10,
                        new Location(UUID.fromString("9b5dcb09-bd42-4306-a964-da0727c44a68"),
                                "Baker Street",
                                "London",
                                "UK",
                                "Sport Center",
                                teams),
                        LocalDateTime.now(),
                        new User(UUID.fromString("9500b3e4-72e5-46d1-93af-30f771c192bd"),
                                teams, "John Doe",
                                "555-444-333",
                                "test@gmail.com",
                                teams,
                                conversations),
                        true,
                        new Details(),
                        sports,
                        users
                ));
    }
}
