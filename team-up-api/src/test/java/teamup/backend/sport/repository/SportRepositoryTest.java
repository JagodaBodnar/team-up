package teamup.backend.sport.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import teamup.backend.sport.model.Sport;
import teamup.backend.sport.model.SportCode;


import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
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
        System.out.println("actualResult = " + actualResult);
        assertEquals(1, actualResult.size());
        assertEquals(SportCode.VOLLEYBALL, actualResult.getFirst().getCode());
    }
}
