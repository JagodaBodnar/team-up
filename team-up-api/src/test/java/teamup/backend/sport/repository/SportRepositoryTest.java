package teamup.backend.sport.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;
import teamup.backend.sport.model.Sport;
import teamup.backend.sport.model.SportCode;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ActiveProfiles("test")
@SqlGroup({
        @Sql(scripts = "/test-data-clear.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD),
        @Sql(scripts = "/test-data-sport.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
})
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
        assertAll(
                "Grouped assertions findAll()",
                () -> assertEquals(1, actualResult.size()),
                () -> assertEquals(SportCode.VOLLEYBALL, actualResult.getFirst().getCode())
        );
    }
}
