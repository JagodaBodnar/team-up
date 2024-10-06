package teamup.backend.sport.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import teamup.backend.sport.model.Sport;
import teamup.backend.sport.model.SportCode;


import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ActiveProfiles("test")
public class SportRepositoryTest {
    @Autowired
    SportRepository sportRepository;

    @BeforeEach
    void setUp() {
        Sport sport = MockedSportRepository.createNewSport();
        Sport savedConsultant = sportRepository.save(sport);
    }

    @Test
    void shouldReturnListOfSports() {
        var actualResult = sportRepository.findAll();
        assertEquals(1, actualResult.size());
        assertEquals(SportCode.VOLLEYBALL, actualResult.getFirst().getCode());
    }
}
